package com.zombiegame.entities;

import com.zombiegame.config.Weapon;
import com.zombiegame.engine.InputHandler;
import com.zombiegame.engine.SoundEngine;
import com.zombiegame.world.GameMap;

import java.awt.*;
import java.awt.geom.Arc2D;
import java.util.ArrayList;
import java.util.List;

public class Player extends Entity {
    public double speed = 4.2;
    public int armor = 50;
    public int maxArmor = 50;
    public List<Weapon> unlockedWeapons = new ArrayList<>();
    public int currentWeaponIndex = 0;
    public int ammo;
    public long lastShotTime = 0;
    public boolean isReloading = false;
    public long reloadStartTime = 0;
    public int flashCount = 0;

    public Player(double x, double y) {
        super(x, y, 20);
        this.unlockedWeapons.add(Weapon.getAllWeapons().get(0));
        this.ammo = getWeapon().maxAmmo;
    }

    public Weapon getWeapon() {
        if (currentWeaponIndex >= unlockedWeapons.size()) currentWeaponIndex = 0;
        return unlockedWeapons.get(currentWeaponIndex);
    }

    public void update(InputHandler input, GameMap map) {
        if (isDead) return;

        double dx = 0;
        double dy = 0;

        if (input.isMovingUp()) dy -= 1;
        if (input.isMovingDown()) dy += 1;
        if (input.isMovingLeft()) dx -= 1;
        if (input.isMovingRight()) dx += 1;

        if (dx != 0 && dy != 0) {
            dx *= 0.7071;
            dy *= 0.7071;
        }

        double nextX = x + dx * speed;
        double nextY = y + dy * speed;

        if (!map.checkCollision(nextX, y, radius)) {
            x = Math.max(radius, Math.min(map.width - radius, nextX));
        }
        if (!map.checkCollision(x, nextY, radius)) {
            y = Math.max(radius, Math.min(map.height - radius, nextY));
        }

        angle = Math.atan2(input.mouseWorldY - y, input.mouseWorldX - x);

        if (isReloading) {
            if (System.currentTimeMillis() - reloadStartTime >= getWeapon().reloadTime) {
                isReloading = false;
                ammo = getWeapon().maxAmmo;
            }
        }
    }

    public void shoot(InputHandler input, List<Projectile> projectiles, ParticleEngine particles) {
        if (isDead || isReloading) return;

        long now = System.currentTimeMillis();
        Weapon w = getWeapon();
        if (now - lastShotTime < w.fireRate) return;

        if (ammo <= 0) {
            startReload();
            return;
        }

        lastShotTime = now;
        ammo--;

        SoundEngine.getInstance().playShoot(w.name);

        for (int i = 0; i < w.pellets; i++) {
            double spreadAngle = (Math.random() - 0.5) * w.spread;
            double finalAngle = angle + spreadAngle;

            projectiles.add(new Projectile(
                    x + Math.cos(angle) * 25,
                    y + Math.sin(angle) * 25,
                    finalAngle,
                    w.speed,
                    w.damage,
                    w.range,
                    w.color,
                    true
            ));
        }

        particles.createMuzzleFlash(x + Math.cos(angle) * 28, y + Math.sin(angle) * 28, w.color);

        if (ammo <= 0) {
            startReload();
        }
    }

    public void startReload() {
        if (isReloading) return;
        isReloading = true;
        reloadStartTime = System.currentTimeMillis();
    }

    public void unlockWeapon(Weapon weapon) {
        boolean exists = false;
        for (Weapon w : unlockedWeapons) {
            if (w.id == weapon.id) {
                exists = true;
                break;
            }
        }
        if (!exists) {
            unlockedWeapons.add(weapon);
            currentWeaponIndex = unlockedWeapons.size() - 1;
            ammo = weapon.maxAmmo;
        }
    }

    @Override
    public void takeDamage(int amount) {
        if (isDead) return;

        int damageToHealth = amount;
        if (armor > 0) {
            int absorbed = (int) Math.min(armor, amount * 0.6);
            armor -= absorbed;
            damageToHealth = amount - absorbed;
        }

        health -= damageToHealth;
        flashCount = 8;
        SoundEngine.getInstance().playPlayerHurt();

        if (health <= 0) {
            health = 0;
            isDead = true;
        }
    }

    public void render(Graphics2D g2d) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.translate(x, y);

        // Drop Shadow
        g.setColor(new Color(0, 0, 0, 120));
        g.fillOval((int) -radius, (int) (-radius + 6), (int) (radius * 2), (int) (radius * 1.6));

        // Hurt Flash Red Aura
        if (flashCount > 0) {
            flashCount--;
            g.setColor(new Color(255, 0, 0, 130));
            g.fillOval((int) (-radius - 6), (int) (-radius - 6), (int) ((radius + 6) * 2), (int) ((radius + 6) * 2));
        }

        // Tactical Flashlight Cone
        double coneDegrees = 52;
        double startAngleDeg = Math.toDegrees(-angle) - coneDegrees / 2;
        Arc2D.Double flashlight = new Arc2D.Double(-380, -380, 760, 760, startAngleDeg, coneDegrees, Arc2D.PIE);
        g.setColor(new Color(255, 235, 190, 45));
        g.fill(flashlight);

        g.rotate(angle);

        // Red Laser Sight Beam
        g.setStroke(new BasicStroke(1));
        g.setColor(new Color(255, 0, 0, 120));
        g.drawLine(15, 0, 400, 0);

        // Body Base (Camo Tactical Armor)
        g.setColor(new Color(35, 55, 40)); // Camo green vest
        g.fillOval((int) -radius, (int) -radius, (int) (radius * 2), (int) (radius * 2));
        g.setStroke(new BasicStroke(2.5f));
        g.setColor(new Color(0, 229, 255));
        g.drawOval((int) -radius, (int) -radius, (int) (radius * 2), (int) (radius * 2));

        // Shoulder Armor Plates & Tactical Straps
        g.setColor(new Color(20, 30, 45));
        g.fillRect(-12, -17, 12, 6); // Left shoulder plate
        g.fillRect(-12, 11, 12, 6);  // Right shoulder plate
        g.setColor(new Color(15, 20, 28));
        g.fillRect(-8, -12, 16, 24); // Utility vest

        // Haunted Battle-Hardened Face Graphics
        g.setColor(new Color(210, 170, 140)); // Weathered skin tone
        g.fillOval(-4, -8, 14, 16);

        // Sunken Haunted Eye Circles & Intense Visor Headband
        g.setColor(new Color(40, 20, 20, 200)); // Dark haunted eye sockets
        g.fillOval(2, -6, 5, 5);
        g.fillOval(2, 1, 5, 5);

        // Glowing Haunted Visor / Headband
        g.setColor(new Color(0, 229, 255));
        g.fillRect(3, -6, 3, 4);
        g.fillRect(3, 1, 3, 4);

        // Battle Scar across cheek
        g.setColor(new Color(180, 40, 40));
        g.drawLine(0, -4, 6, 2);

        // Grim Mouth Line & Bandages
        g.setColor(new Color(60, 30, 30));
        g.drawLine(4, -1, 7, -1);
        g.setColor(Color.WHITE); // Arm Bandage
        g.fillRect(6, -15, 5, 4);

        // Hands & Weapon Model
        g.setColor(new Color(210, 170, 140));
        g.fillOval(12, -12, 6, 6);
        g.fillOval(12, 6, 6, 6);

        // Rifle Model (Stock, Barrel & Muzzle)
        g.setColor(new Color(25, 30, 40));
        g.fillRect(10, -4, 20, 8);
        g.setColor(getWeapon().color);
        g.fillRect(18, -2, 12, 4);
        g.setColor(Color.BLACK);
        g.fillRect(28, -1, 4, 2);

        g.dispose();
    }
}
