package com.zombiegame.entities;

public abstract class Entity {
    public double x;
    public double y;
    public double radius;
    public double angle = 0;
    public int health = 100;
    public int maxHealth = 100;
    public boolean isDead = false;

    public Entity(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public double distanceTo(Entity other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public boolean collidesWith(Entity other) {
        return distanceTo(other) < (this.radius + other.radius);
    }

    public void takeDamage(int amount) {
        this.health -= amount;
        if (this.health <= 0) {
            this.health = 0;
            this.isDead = true;
        }
    }
}
