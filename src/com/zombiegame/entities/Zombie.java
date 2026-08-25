package com.zombiegame.entities;

import com.zombiegame.config.EnemyConfig;
import com.zombiegame.engine.SoundEngine;
import com.zombiegame.world.GameMap;

import java.awt.*;
import java.util.List;

public class Zombie extends Entity {
    public String type;
    public String name;
    public double speed;
    public int damage;
    public Color color;
    public int scoreValue;
    public double armorFactor;
    public boolean isBoss;
    public int attackRange;
    public int attackCooldown;
    public long lastAttackTime = 0;
    public int flashWhite = 0;
    public Integer isGuardianForKeyIndex = null;
    public long lastGroan = System.currentTimeMillis();

    public Zombie(double x, double y, EnemyConfig config) {
        super(x, y, config.radius);
        this.type = config.type;
        this.name = config.name;
        this.health = config.health;
        this.maxHealth = config.health;
        this.speed = config.speed;
        this.damage = config.damage;
        this.color = config.color;
        this.scoreValue = config.scoreValue;
        this.armorFactor = config.armorFactor;
        this.isBoss = config.isBoss;
        this.attackRange = config.attackRange;
        this.attackCooldown = config.attackCooldown;
    }

    public void update(Player player, GameMap map, List<Projectile> projectiles, ParticleEngine particles) {
        if (isDead) return;

        double dist = distanceTo(player);

        if (dist < 450 && System.currentTimeMillis() - lastGroan > 4000) {
            lastGroan = System.currentTimeMillis();
            SoundEngine.getInstance().playZombieGroan();
        }

        angle = Math.atan2(player.y - y, player.x - x);

        if (dist < 600) {
            double vx = Math.cos(angle) * speed;
            double vy = Math.sin(angle) * speed;

            double nextX = x + vx;
            double nextY = y + vy;

            if (!map.checkCollision(nextX, y, radius)) x = nextX;
            if (!map.checkCollision(x, nextY, radius)) y = nextY;
        }

        long now = System.currentTimeMillis();
        if ("ranged".equals(type) && dist < attackRange && dist > 80) {
            if (now - lastAttackTime > attackCooldown) {
                lastAttackTime = now;
                projectiles.add(new Projectile(x, y, angle, 7.0, damage, 400, new Color(159, 122, 234), false));
            }
        } else if (isBoss && now - lastAttackTime > 3000) {
            lastAttackTime = now;
            int count = 12;
            for (int i = 0; i < count; i++) {
                double ringAngle = (Math.PI * 2 / count) * i;
                projectiles.add(new Projectile(x, y, ringAngle, 6.0, 20, 450, new Color(183, 148, 244), false));
            }
        } else if (dist <= (radius + player.radius + 5)) {
            if (now - lastAttackTime > attackCooldown) {
                lastAttackTime = now;
                player.takeDamage(damage);
                particles.createBloodSpatter(player.x, player.y, 8);
            }
        }
    }

    public void takeDamage(int amount, ParticleEngine particles) {
        if (isDead) return;

        int actualDamage = (int) Math.round(amount * armorFactor);
        health -= actualDamage;
        flashWhite = 6;
        SoundEngine.getInstance().playHit();

        boolean isCrit = actualDamage > 70;
        particles.addDamageText(x + (Math.random() - 0.5) * 20, y - 20, actualDamage, isCrit);
        particles.createBloodSpatter(x, y, 6);

        if (health <= 0) {
            health = 0;
            isDead = true;
            particles.createZombieDeathEffect(x, y, color);
        }
    }

    public void render(Graphics2D g2d) {
        Graphics2D g = (Graphics2D) g2d.create();
        g.translate(x, y);

        // Drop shadow under zombie
        g.setColor(new Color(0, 0, 0, 100));
        g.fillOval((int) -radius, (int) (-radius + 5), (int) (radius * 2), (int) (radius * 1.5));

        g.rotate(angle);

        // Flash white on hit
        if (flashWhite > 0) {
            flashWhite--;
            g.setColor(Color.WHITE);
            g.fillOval((int) -radius - 3, (int) -radius - 3, (int) (radius + 3) * 2, (int) (radius + 3) * 2);
        }

        // Realistic Zombie Body Shading
        GradientPaint bodyGrad = new GradientPaint(
                (float) -radius, (float) -radius, color.brighter(),
                (float) radius, (float) radius, color.darker().darker()
        );
        g.setPaint(bodyGrad);
        g.fillOval((int) -radius, (int) -radius, (int) (radius * 2), (int) (radius * 2));

        // Tattered clothes / Blood stains
        g.setColor(new Color(120, 20, 20, 200));
        g.fillOval((int) (-radius * 0.4), (int) (-radius * 0.5), (int) (radius * 0.8), (int) (radius * 0.8));

        // Outline
        g.setStroke(new BasicStroke(2));
        g.setColor(isBoss ? new Color(255, 215, 0) : new Color(20, 30, 20));
        g.drawOval((int) -radius, (int) -radius, (int) (radius * 2), (int) (radius * 2));

        // Claws & Extended Bloody Arms
        g.setColor(color.darker());
        g.fillRect(8, -12, (int) (radius * 0.7), 5);
        g.fillRect(8, 7, (int) (radius * 0.7), 5);

        // Bloody claw tips
        g.setColor(new Color(200, 30, 30));
        g.fillRect(8 + (int) (radius * 0.7), -13, 4, 7);
        g.fillRect(8 + (int) (radius * 0.7), 6, 4, 7);

        // Sunken Glowing Eyes
        g.setColor(isBoss ? new Color(255, 215, 0) : new Color(255, 30, 30));
        g.fillOval(5, -6, 5, 5);
        g.fillOval(5, 2, 5, 5);

        // Eye glow aura
        g.setColor(isBoss ? new Color(255, 215, 0, 100) : new Color(255, 0, 0, 100));
        g.fillOval(3, -8, 9, 9);
        g.fillOval(3, 0, 9, 9);

        // Mouth cavity / Fangs
        g.setColor(new Color(40, 10, 10));
        g.fillRect(8, -3, 6, 6);
        g.setColor(Color.WHITE);
        g.drawLine(8, -3, 10, -1);
        g.drawLine(8, 3, 10, 1);

        // Special Boss Spikes & Aura
        if (isBoss) {
            g.setColor(new Color(183, 148, 244, 80));
            g.fillOval((int) (-radius * 1.3), (int) (-radius * 1.3), (int) (radius * 2.6), (int) (radius * 2.6));
            g.setColor(new Color(255, 215, 0));
            g.drawOval((int) (-radius * 1.3), (int) (-radius * 1.3), (int) (radius * 2.6), (int) (radius * 2.6));
        }

        g.dispose();

        // Health Bar above Zombie
        if (health < maxHealth) {
            int barW = (int) (radius * 2.2);
            int barH = 6;
            int barX = (int) (x - barW / 2);
            int barY = (int) (y - radius - 14);

            g2d.setColor(new Color(10, 14, 22, 220));
            g2d.fillRect(barX, barY, barW, barH);

            double pct = Math.max(0, (double) health / maxHealth);
            g2d.setColor(isBoss ? new Color(183, 148, 244) : new Color(229, 62, 62));
            g2d.fillRect(barX, barY, (int) (barW * pct), barH);
            g2d.setColor(Color.BLACK);
            g2d.drawRect(barX, barY, barW, barH);
        }
    }
}
