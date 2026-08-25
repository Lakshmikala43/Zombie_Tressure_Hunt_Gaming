package com.zombiegame.ui;

import com.zombiegame.config.LevelConfig;
import com.zombiegame.entities.Player;
import com.zombiegame.entities.TreasureEntity;
import com.zombiegame.entities.Zombie;

import java.awt.*;
import java.util.List;

public class HUDOverlay {
    public void render(Graphics2D g2d, Player player, LevelConfig level, int keysCollected, List<Zombie> zombies, TreasureEntity treasure, Zombie boss, int viewportW, int viewportH) {
        Graphics2D g = (Graphics2D) g2d.create();

        // 1. Health & Armor Bar Box Top Left
        g.setColor(new Color(10, 14, 22, 210));
        g.fillRect(15, 15, 230, 85);
        g.setColor(new Color(255, 51, 68));
        g.fillRect(15, 15, 4, 85);

        g.setFont(new Font("Dialog", Font.BOLD, 12));
        g.setColor(new Color(160, 174, 192));
        g.drawString("❤️ HEALTH: " + Math.max(0, player.health) + " / " + player.maxHealth, 28, 34);

        g.setColor(new Color(0, 0, 0, 150));
        g.fillRect(28, 40, 200, 10);
        g.setColor(new Color(255, 51, 68));
        int hpWidth = (int) (200 * (Math.max(0, (double) player.health / player.maxHealth)));
        g.fillRect(28, 40, hpWidth, 10);

        g.setColor(new Color(160, 174, 192));
        g.drawString("🛡 ARMOR: " + Math.max(0, player.armor) + " / " + player.maxArmor, 28, 68);

        g.setColor(new Color(0, 0, 0, 150));
        g.fillRect(28, 74, 200, 10);
        g.setColor(new Color(0, 229, 255));
        int armorWidth = (int) (200 * (Math.max(0, (double) player.armor / player.maxArmor)));
        g.fillRect(28, 74, armorWidth, 10);

        // 2. Boss Health Bar (If Boss active)
        if (boss != null && !boss.isDead) {
            g.setColor(new Color(10, 14, 22, 220));
            g.fillRect(viewportW / 2 - 200, 15, 400, 45);
            g.setColor(new Color(183, 148, 244));
            g.drawRect(viewportW / 2 - 200, 15, 400, 45);

            g.setFont(new Font("Dialog", Font.BOLD, 13));
            g.setColor(new Color(255, 215, 0));
            g.drawString("🧟 " + boss.name + " (" + Math.max(0, boss.health) + " / " + boss.maxHealth + ")", viewportW / 2 - 180, 32);

            g.setColor(new Color(0, 0, 0, 180));
            g.fillRect(viewportW / 2 - 180, 38, 360, 10);
            g.setColor(new Color(183, 148, 244));
            int bWidth = (int) (360 * (Math.max(0, (double) boss.health / boss.maxHealth)));
            g.fillRect(viewportW / 2 - 180, 38, bWidth, 10);
        }

        // 3. Weapon HUD Bottom Left
        g.setColor(new Color(10, 14, 22, 210));
        g.fillRect(15, viewportH - 85, 240, 65);
        g.setColor(new Color(255, 215, 0));
        g.fillRect(15, viewportH - 85, 4, 65);

        g.setFont(new Font("SansSerif", Font.BOLD, 26));
        g.drawString(player.getWeapon().icon, 28, viewportH - 43);

        g.setFont(new Font("Dialog", Font.BOLD, 14));
        g.setColor(new Color(255, 215, 0));
        g.drawString(player.getWeapon().name, 68, viewportH - 60);

        g.setFont(new Font("Dialog", Font.BOLD, 16));
        g.setColor(Color.WHITE);
        g.drawString(player.isReloading ? "RELOADING..." : (player.ammo + " / " + player.getWeapon().maxAmmo), 68, viewportH - 35);

        // 4. Minimap Box Top Right
        int mmW = 150;
        int mmH = 150;
        int mmX = viewportW - mmW - 20;
        int mmY = 15;

        g.setColor(new Color(7, 9, 14, 230));
        g.fillRect(mmX, mmY, mmW, mmH);
        g.setColor(new Color(255, 215, 0, 180));
        g.drawRect(mmX, mmY, mmW, mmH);

        double scaleX = (double) mmW / level.worldWidth;
        double scaleY = (double) mmH / level.worldHeight;

        // Zombies on minimap
        g.setColor(new Color(255, 51, 68));
        for (Zombie z : zombies) {
            if (!z.isDead) {
                g.fillOval((int) (mmX + z.x * scaleX - 1), (int) (mmY + z.y * scaleY - 1), z.isBoss ? 4 : 2, z.isBoss ? 4 : 2);
            }
        }

        // Treasure on minimap
        g.setColor(treasure.isUnlocked ? new Color(0, 255, 136) : new Color(255, 51, 68));
        g.fillOval((int) (mmX + treasure.x * scaleX - 3), (int) (mmY + treasure.y * scaleY - 3), 6, 6);

        // Player cyan dot
        g.setColor(new Color(0, 229, 255));
        g.fillOval((int) (mmX + player.x * scaleX - 3), (int) (mmY + player.y * scaleY - 3), 6, 6);

        g.setFont(new Font("Dialog", Font.BOLD, 10));
        g.setColor(new Color(255, 215, 0));
        g.drawString("MINI MAP", mmX + 8, mmY + 15);

        // Keys badge below minimap
        g.setColor(new Color(10, 14, 22, 210));
        g.fillRect(mmX, mmY + mmH + 8, mmW, 30);
        g.setColor(new Color(255, 215, 0));
        g.drawRect(mmX, mmY + mmH + 8, mmW, 30);
        g.drawString("🔑 KEYS: " + keysCollected + " / 4", mmX + 25, mmY + mmH + 28);

        g.dispose();
    }
}
