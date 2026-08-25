package com.zombiegame.engine;

import com.zombiegame.config.EnemyConfig;
import com.zombiegame.config.LevelConfig;
import com.zombiegame.config.Weapon;
import com.zombiegame.entities.*;
import com.zombiegame.ui.HUDOverlay;
import com.zombiegame.world.GameMap;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GamePanel extends JPanel implements Runnable {
    public enum GameState {
        MAIN_MENU, LEVEL_SELECT, HOW_TO_PLAY, PLAYING, PAUSED, REWARD_MODAL, GAME_OVER, VICTORY
    }

    public GameState state = GameState.MAIN_MENU;
    public int currentLevelId = 1;
    public int unlockedLevels = 1;
    public int score = 0;
    public int zombiesKilledTotal = 0;
    public int keysCollectedInLevel = 0;

    public InputHandler input = new InputHandler();
    public HUDOverlay hud = new HUDOverlay();
    public ParticleEngine particles = new ParticleEngine();

    public Player player;
    public GameMap map;
    public LevelConfig currentLevelConfig;
    public List<Zombie> zombies = new ArrayList<>();
    public List<Projectile> projectiles = new ArrayList<>();
    public List<KeyEntity> keys = new ArrayList<>();
    public List<ClueEntity> clues = new ArrayList<>();
    public TreasureEntity treasure;
    public List<String> discoveredClues = new ArrayList<>();

    public double cameraX = 0;
    public double cameraY = 0;

    private Thread gameThread;
    private final int FPS = 60;
    public Weapon lastRewardWeapon = null;

    public GamePanel() {
        setPreferredSize(new Dimension(1280, 720));
        setBackground(new Color(8, 10, 15));
        setFocusable(true);

        addKeyListener(input.getKeyListener());
        addMouseListener(input.getMouseListener());
        addMouseMotionListener(input.getMouseListener());
    }

    public void startGameThread() {
        if (gameThread == null) {
            gameThread = new Thread(this);
            gameThread.start();
        }
    }

    public void startLevel(int levelId) {
        List<LevelConfig> all = LevelConfig.getAllLevels();
        currentLevelConfig = all.stream().filter(l -> l.id == levelId).findFirst().orElse(all.get(0));
        this.currentLevelId = currentLevelConfig.id;

        keysCollectedInLevel = 0;
        discoveredClues.clear();
        projectiles.clear();
        zombies.clear();
        keys.clear();
        clues.clear();

        map = new GameMap(currentLevelConfig);
        player = new Player(currentLevelConfig.playerSpawn.x, currentLevelConfig.playerSpawn.y);

        int highestWepId = Math.min(currentLevelConfig.rewardWeaponId, Weapon.getAllWeapons().size());
        for (int i = 0; i < highestWepId; i++) {
            player.unlockWeapon(Weapon.getAllWeapons().get(i));
        }

        for (int i = 0; i < currentLevelConfig.keys.size(); i++) {
            LevelConfig.KeySpawn ks = currentLevelConfig.keys.get(i);
            keys.add(new KeyEntity(ks.id, ks.pos.x, ks.pos.y));

            String text = (i < currentLevelConfig.clues.length) ? currentLevelConfig.clues[i] : "🧩 CLUE " + (i + 1);
            clues.add(new ClueEntity(i, ks.guardianSpawn.x, ks.guardianSpawn.y, text));
        }

        treasure = new TreasureEntity(currentLevelConfig.treasurePos.x, currentLevelConfig.treasurePos.y);

        Map<String, EnemyConfig> enemyCfgs = EnemyConfig.getConfigs();
        for (LevelConfig.RoamingSpawn rz : currentLevelConfig.roamingZombies) {
            EnemyConfig cfg = enemyCfgs.getOrDefault(rz.type, enemyCfgs.get("normal"));
            zombies.add(new Zombie(rz.pos.x, rz.pos.y, cfg));
        }

        triggerKeyGuardianWave(0);

        state = GameState.PLAYING;
    }

    private void triggerKeyGuardianWave(int keyIndex) {
        if (keyIndex >= currentLevelConfig.keys.size()) return;
        LevelConfig.KeySpawn keyCfg = currentLevelConfig.keys.get(keyIndex);

        Map<String, EnemyConfig> enemyCfgs = EnemyConfig.getConfigs();
        EnemyConfig cfg = enemyCfgs.getOrDefault(keyCfg.guardianType, enemyCfgs.get("normal"));

        for (int i = 0; i < keyCfg.guardianCount; i++) {
            double offsetX = (Math.random() - 0.5) * 60;
            double offsetY = (Math.random() - 0.5) * 60;
            Zombie guardian = new Zombie(keyCfg.guardianSpawn.x + offsetX, keyCfg.guardianSpawn.y + offsetY, cfg);
            guardian.isGuardianForKeyIndex = keyIndex;
            zombies.add(guardian);
        }
    }

    @Override
    public void run() {
        double drawInterval = 1000000000.0 / FPS;
        double delta = 0;
        long lastTime = System.nanoTime();

        while (gameThread != null) {
            long currentTime = System.nanoTime();
            delta += (currentTime - lastTime) / drawInterval;
            lastTime = currentTime;

            if (delta >= 1) {
                update();
                repaint();
                delta--;
            }
        }
    }

    private void update() {
        if (input.mousePressed) {
            handleMenuMouseClicks();
        }

        if (state == GameState.PLAYING) {
            if (input.pausePressed) {
                state = GameState.PAUSED;
                input.resetFrameFlags();
                return;
            }

            cameraX = player.x - getWidth() / 2.0;
            cameraY = player.y - getHeight() / 2.0;
            cameraX = Math.max(0, Math.min(map.width - getWidth(), cameraX));
            cameraY = Math.max(0, Math.min(map.height - getHeight(), cameraY));

            input.updateMouseWorld(cameraX, cameraY);

            player.update(input, map);
            if (input.isAttacking()) {
                player.shoot(input, projectiles, particles);
            }

            for (int i = projectiles.size() - 1; i >= 0; i--) {
                Projectile p = projectiles.get(i);
                p.update(map);
                if (p.isDead) {
                    projectiles.remove(i);
                    continue;
                }

                if (p.isPlayerBullet) {
                    for (Zombie z : zombies) {
                        if (!z.isDead && p.collidesWith(z)) {
                            z.takeDamage(p.damage, particles);
                            p.isDead = true;
                            if (z.isDead) {
                                score += z.scoreValue;
                                zombiesKilledTotal++;
                                checkGuardianDefeated(z);
                            }
                            break;
                        }
                    }
                } else {
                    if (p.collidesWith(player)) {
                        player.takeDamage(p.damage);
                        p.isDead = true;
                    }
                }
            }

            for (Zombie z : zombies) {
                z.update(player, map, projectiles, particles);
            }

            // Grab Clues by walking up to Clue items
            for (ClueEntity c : clues) {
                if (c.isRevealed && !c.isCollected) {
                    double dist = player.distanceTo(c);
                    if (dist < 40 || (dist < 60 && input.interactPressed)) {
                        c.collect();
                        discoveredClues.add(c.clueText);
                        score += 150;
                        particles.addDamageText(c.x, c.y - 10, 150, true);

                        // Reveal Key after grabbing clue!
                        if (c.index < keys.size()) {
                            keys.get(c.index).reveal();
                        }
                    }
                }
            }

            // Collect Keys
            for (int i = 0; i < keys.size(); i++) {
                KeyEntity k = keys.get(i);
                if (k.isRevealed && !k.isCollected) {
                    double dist = player.distanceTo(k);
                    if (dist < 40 || (dist < 60 && input.interactPressed)) {
                        k.collect();
                        keysCollectedInLevel++;
                        score += 250;

                        if (i < 3) {
                            triggerKeyGuardianWave(i + 1);
                        }

                        if (keysCollectedInLevel >= 4) {
                            treasure.unlock();
                        }
                    }
                }
            }

            if (treasure.isUnlocked && !treasure.isOpened) {
                double dist = player.distanceTo(treasure);
                if (dist < 50 && (input.interactPressed || input.mousePressed)) {
                    treasure.open();
                    score += 1000;

                    Weapon reward = Weapon.getAllWeapons().get(Math.min(currentLevelConfig.rewardWeaponId - 1, Weapon.getAllWeapons().size() - 1));
                    player.unlockWeapon(reward);
                    lastRewardWeapon = reward;

                    if (currentLevelId >= unlockedLevels && unlockedLevels < 10) {
                        unlockedLevels = currentLevelId + 1;
                    }

                    if (currentLevelConfig.isBossLevel) {
                        state = GameState.VICTORY;
                    } else {
                        state = GameState.REWARD_MODAL;
                    }
                }
            }

            particles.update();

            if (player.isDead) {
                SoundEngine.getInstance().playGameOver();
                state = GameState.GAME_OVER;
            }
        }

        input.resetFrameFlags();
    }

    private void handleMenuMouseClicks() {
        int mx = input.mouseX;
        int my = input.mouseY;

        if (state == GameState.MAIN_MENU) {
            if (isInside(mx, my, getWidth() / 2 - 140, 300, 280, 50)) {
                startLevel(unlockedLevels);
            } else if (isInside(mx, my, getWidth() / 2 - 140, 370, 280, 50)) {
                state = GameState.LEVEL_SELECT;
            } else if (isInside(mx, my, getWidth() / 2 - 140, 440, 280, 50)) {
                state = GameState.HOW_TO_PLAY;
            }
        } else if (state == GameState.LEVEL_SELECT) {
            List<LevelConfig> levels = LevelConfig.getAllLevels();
            int cols = 5;
            int cardW = 180;
            int cardH = 120;
            int startX = getWidth() / 2 - (cols * cardW + (cols - 1) * 20) / 2;
            int startY = 150;

            for (int i = 0; i < levels.size(); i++) {
                LevelConfig l = levels.get(i);
                int row = i / cols;
                int col = i % cols;
                int x = startX + col * (cardW + 20);
                int y = startY + row * (cardH + 20);

                if (isInside(mx, my, x, y, cardW, cardH)) {
                    if (l.id <= unlockedLevels) {
                        startLevel(l.id);
                    }
                }
            }

            if (isInside(mx, my, getWidth() / 2 - 100, 520, 200, 45)) {
                state = GameState.MAIN_MENU;
            }
        } else if (state == GameState.HOW_TO_PLAY) {
            if (isInside(mx, my, getWidth() / 2 - 100, 500, 200, 45)) {
                state = GameState.MAIN_MENU;
            }
        } else if (state == GameState.PAUSED) {
            if (isInside(mx, my, getWidth() / 2 - 110, 310, 220, 45)) {
                state = GameState.PLAYING;
            } else if (isInside(mx, my, getWidth() / 2 - 110, 370, 220, 45)) {
                state = GameState.MAIN_MENU;
            }
        } else if (state == GameState.REWARD_MODAL) {
            if (isInside(mx, my, getWidth() / 2 - 110, 380, 220, 50)) {
                if (currentLevelId < 10) {
                    startLevel(currentLevelId + 1);
                } else {
                    state = GameState.VICTORY;
                }
            }
        } else if (state == GameState.GAME_OVER) {
            if (isInside(mx, my, getWidth() / 2 - 110, 400, 220, 45)) {
                startLevel(currentLevelId);
            } else if (isInside(mx, my, getWidth() / 2 - 110, 460, 220, 45)) {
                state = GameState.MAIN_MENU;
            }
        } else if (state == GameState.VICTORY) {
            if (isInside(mx, my, getWidth() / 2 - 110, 370, 220, 50)) {
                state = GameState.MAIN_MENU;
            }
        }
    }

    private boolean isInside(int mx, int my, int x, int y, int w, int h) {
        return mx >= x && mx <= x + w && my >= y && my <= y + h;
    }

    private void checkGuardianDefeated(Zombie zombie) {
        if (zombie.isGuardianForKeyIndex != null) {
            int idx = zombie.isGuardianForKeyIndex;
            boolean remaining = zombies.stream().anyMatch(z -> z.isGuardianForKeyIndex != null && z.isGuardianForKeyIndex == idx && !z.isDead);
            if (!remaining) {
                if (idx < clues.size()) {
                    clues.get(idx).reveal(); // Reveal physical clue entity to grab!
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        if (state == GameState.PLAYING || state == GameState.PAUSED || state == GameState.REWARD_MODAL || state == GameState.GAME_OVER || state == GameState.VICTORY) {
            Graphics2D worldG = (Graphics2D) g2d.create();
            worldG.translate(-cameraX, -cameraY);

            map.renderTerrain(worldG);

            for (ClueEntity c : clues) c.render(worldG);
            for (KeyEntity k : keys) k.render(worldG);
            treasure.render(worldG);

            for (Zombie z : zombies) {
                if (!z.isDead) z.render(worldG);
            }

            player.render(worldG);

            for (Projectile p : projectiles) p.render(worldG);
            particles.render(worldG);

            worldG.dispose();

            Zombie boss = zombies.stream().filter(z -> z.isBoss && !z.isDead).findFirst().orElse(null);
            hud.render(g2d, player, currentLevelConfig, keysCollectedInLevel, zombies, treasure, boss, getWidth(), getHeight());

            if (state == GameState.PAUSED) renderPauseOverlay(g2d);
            else if (state == GameState.REWARD_MODAL) renderRewardOverlay(g2d);
            else if (state == GameState.GAME_OVER) renderGameOverOverlay(g2d);
            else if (state == GameState.VICTORY) renderVictoryOverlay(g2d);

        } else if (state == GameState.MAIN_MENU) {
            renderMainMenu(g2d);
        } else if (state == GameState.LEVEL_SELECT) {
            renderLevelSelect(g2d);
        } else if (state == GameState.HOW_TO_PLAY) {
            renderHowToPlay(g2d);
        }
    }

    private void renderMainMenu(Graphics2D g) {
        g.setColor(new Color(15, 20, 30));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 52));
        g.setColor(new Color(255, 51, 68));
        g.drawString("ZOMBIE TREASURE HUNT", getWidth() / 2 - 340, 180);

        g.setFont(new Font("Dialog", Font.BOLD, 18));
        g.setColor(new Color(160, 174, 192));
        g.drawString("Find the Keys. Defeat the Zombies. Unlock the Treasure.", getWidth() / 2 - 240, 220);

        renderButton(g, "🎮 PLAY GAME", getWidth() / 2 - 140, 300, 280, 50);
        renderButton(g, "🗺️ LEVEL SELECT", getWidth() / 2 - 140, 370, 280, 50);
        renderButton(g, "📖 HOW TO PLAY", getWidth() / 2 - 140, 440, 280, 50);
    }

    private void renderLevelSelect(Graphics2D g) {
        g.setColor(new Color(15, 20, 30));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 36));
        g.setColor(new Color(255, 215, 0));
        g.drawString("LEVEL SELECT", getWidth() / 2 - 130, 80);

        List<LevelConfig> levels = LevelConfig.getAllLevels();
        int cols = 5;
        int cardW = 180;
        int cardH = 120;
        int startX = getWidth() / 2 - (cols * cardW + (cols - 1) * 20) / 2;
        int startY = 150;

        for (int i = 0; i < levels.size(); i++) {
            LevelConfig l = levels.get(i);
            int row = i / cols;
            int col = i % cols;
            int x = startX + col * (cardW + 20);
            int y = startY + row * (cardH + 20);

            boolean unlocked = l.id <= unlockedLevels;
            boolean hover = isInside(input.mouseX, input.mouseY, x, y, cardW, cardH);

            g.setColor(hover && unlocked ? new Color(40, 55, 80) : (unlocked ? new Color(25, 35, 50) : new Color(15, 20, 25)));
            g.fillRect(x, y, cardW, cardH);
            g.setColor(unlocked ? new Color(255, 51, 68) : new Color(60, 70, 85));
            g.drawRect(x, y, cardW, cardH);

            g.setFont(new Font("Dialog", Font.BOLD, 22));
            g.setColor(unlocked ? new Color(255, 215, 0) : Color.GRAY);
            g.drawString("Level " + l.id, x + 50, y + 40);

            g.setFont(new Font("Dialog", Font.PLAIN, 12));
            g.setColor(Color.WHITE);
            g.drawString(l.name, x + 20, y + 70);

            g.setFont(new Font("Dialog", Font.BOLD, 12));
            g.setColor(unlocked ? new Color(72, 187, 120) : Color.GRAY);
            g.drawString(unlocked ? "✓ UNLOCKED" : "🔒 LOCKED", x + 40, y + 95);
        }

        renderButton(g, "⬅️ BACK TO MENU", getWidth() / 2 - 100, 520, 200, 45);
    }

    private void renderHowToPlay(Graphics2D g) {
        g.setColor(new Color(15, 20, 30));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 36));
        g.setColor(new Color(0, 229, 255));
        g.drawString("HOW TO PLAY", getWidth() / 2 - 130, 100);

        g.setColor(new Color(25, 35, 50));
        g.fillRect(getWidth() / 2 - 300, 150, 600, 320);

        g.setFont(new Font("Dialog", Font.BOLD, 16));
        g.setColor(new Color(255, 215, 0));
        g.drawString("🕹️ CONTROLS", getWidth() / 2 - 270, 190);
        g.setFont(new Font("Dialog", Font.PLAIN, 14));
        g.setColor(Color.WHITE);
        g.drawString("WASD / Arrow Keys : Move Character", getWidth() / 2 - 270, 220);
        g.drawString("Left Click / SPACE : Shoot towards cursor", getWidth() / 2 - 270, 245);
        g.drawString("E : Grab Physical Clues 🧩 & Keys 🔑", getWidth() / 2 - 270, 270);
        g.drawString("ESC : Pause Game", getWidth() / 2 - 270, 295);

        g.setFont(new Font("Dialog", Font.BOLD, 16));
        g.setColor(new Color(0, 229, 255));
        g.drawString("🗝️ GAMEPLAY LOOP", getWidth() / 2 - 270, 340);
        g.setFont(new Font("Dialog", Font.PLAIN, 14));
        g.setColor(Color.WHITE);
        g.drawString("1. Explore Map -> 2. Defeat Guardian Zombies -> 3. Grab Clue 🧩", getWidth() / 2 - 270, 370);
        g.drawString("4. Grab Key 🔑 -> 5. Unlock Treasure Gift Box 🔓!", getWidth() / 2 - 270, 395);

        renderButton(g, "⬅️ BACK", getWidth() / 2 - 100, 500, 200, 45);
    }

    private void renderPauseOverlay(Graphics2D g) {
        g.setColor(new Color(0, 0, 0, 180));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 42));
        g.setColor(new Color(255, 215, 0));
        g.drawString("PAUSED", getWidth() / 2 - 90, 250);

        renderButton(g, "RESUME GAME", getWidth() / 2 - 110, 310, 220, 45);
        renderButton(g, "MAIN MENU", getWidth() / 2 - 110, 370, 220, 45);
    }

    private void renderRewardOverlay(Graphics2D g) {
        g.setColor(new Color(0, 0, 0, 200));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 36));
        g.setColor(new Color(72, 187, 120));
        g.drawString("🎁 TREASURE UNLOCKED!", getWidth() / 2 - 210, 220);

        if (lastRewardWeapon != null) {
            g.setFont(new Font("Dialog", Font.BOLD, 24));
            g.setColor(new Color(255, 215, 0));
            g.drawString(lastRewardWeapon.icon + " " + lastRewardWeapon.name, getWidth() / 2 - 120, 280);

            g.setFont(new Font("Dialog", Font.PLAIN, 16));
            g.setColor(Color.WHITE);
            g.drawString("Damage: +" + lastRewardWeapon.damage + " | Range: " + lastRewardWeapon.range + "px", getWidth() / 2 - 160, 320);
        }

        renderButton(g, "NEXT LEVEL ➔", getWidth() / 2 - 110, 380, 220, 50);
    }

    private void renderGameOverOverlay(Graphics2D g) {
        g.setColor(new Color(0, 0, 0, 210));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 48));
        g.setColor(new Color(255, 51, 68));
        g.drawString("☠ GAME OVER ☠", getWidth() / 2 - 190, 220);

        g.setFont(new Font("Dialog", Font.PLAIN, 18));
        g.setColor(Color.WHITE);
        g.drawString("Level Reached: Level " + currentLevelId, getWidth() / 2 - 120, 280);
        g.drawString("Zombies Defeated: " + zombiesKilledTotal, getWidth() / 2 - 120, 310);
        g.drawString("Final Score: " + score + " pts", getWidth() / 2 - 120, 340);

        renderButton(g, "🔄 RETRY LEVEL", getWidth() / 2 - 110, 400, 220, 45);
        renderButton(g, "🏠 MAIN MENU", getWidth() / 2 - 110, 460, 220, 45);
    }

    private void renderVictoryOverlay(Graphics2D g) {
        g.setColor(new Color(0, 0, 0, 220));
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setFont(new Font("Dialog", Font.BOLD, 52));
        g.setColor(new Color(255, 215, 0));
        g.drawString("🏆 VICTORY! 🏆", getWidth() / 2 - 180, 220);

        g.setFont(new Font("Dialog", Font.BOLD, 20));
        g.setColor(new Color(72, 187, 120));
        g.drawString("You defeated the Overlord Zombie King and unlocked the Ultimate Treasure!", getWidth() / 2 - 350, 280);

        renderButton(g, "MAIN MENU", getWidth() / 2 - 110, 370, 220, 50);
    }

    private void renderButton(Graphics2D g, String text, int x, int y, int w, int h) {
        boolean hover = isInside(input.mouseX, input.mouseY, x, y, w, h);

        g.setColor(hover ? new Color(255, 70, 90) : new Color(229, 62, 62));
        g.fillRect(x, y, w, h);
        g.setColor(new Color(255, 215, 0));
        g.drawRect(x, y, w, h);

        g.setFont(new Font("Dialog", Font.BOLD, 16));
        g.setColor(Color.WHITE);
        g.drawString(text, x + 30, y + 30);
    }
}
