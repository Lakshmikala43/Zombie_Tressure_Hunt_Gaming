package com.zombiegame.entities;

import com.zombiegame.world.GameMap;

import java.awt.*;

public class Projectile extends Entity {
    public double startX;
    public double startY;
    public double vx;
    public double vy;
    public int damage;
    public int range;
    public Color color;
    public boolean isPlayerBullet;

    public Projectile(double x, double y, double angle, double speed, int damage, int range, Color color, boolean isPlayerBullet) {
        super(x, y, isPlayerBullet ? 4 : 6);
        this.startX = x;
        this.startY = y;
        this.vx = Math.cos(angle) * speed;
        this.vy = Math.sin(angle) * speed;
        this.damage = damage;
        this.range = range;
        this.color = color;
        this.isPlayerBullet = isPlayerBullet;
    }

    public void update(GameMap map) {
        if (isDead) return;

        x += vx;
        y += vy;

        double distTravelled = Math.hypot(x - startX, y - startY);
        if (distTravelled >= range) {
            isDead = true;
            return;
        }

        if (map.checkCollision(x, y, radius)) {
            isDead = true;
        }
    }

    public void render(Graphics2D g2d) {
        g2d.setColor(color);
        g2d.fillOval((int) (x - radius), (int) (y - radius), (int) (radius * 2), (int) (radius * 2));
    }
}
