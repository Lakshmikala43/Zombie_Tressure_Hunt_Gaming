package com.zombiegame.config;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;

public class EnemyConfig {
    public String type;
    public String name;
    public int health;
    public double speed;
    public int damage;
    public int radius;
    public Color color;
    public int scoreValue;
    public double armorFactor = 1.0;
    public boolean isBoss = false;
    public int attackRange;
    public int attackCooldown;

    public EnemyConfig(String type, String name, int health, double speed, int damage, int radius, Color color, int scoreValue, double armorFactor, boolean isBoss, int attackRange, int attackCooldown) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.speed = speed;
        this.damage = damage;
        this.radius = radius;
        this.color = color;
        this.scoreValue = scoreValue;
        this.armorFactor = armorFactor;
        this.isBoss = isBoss;
        this.attackRange = attackRange;
        this.attackCooldown = attackCooldown;
    }

    public static Map<String, EnemyConfig> getConfigs() {
        Map<String, EnemyConfig> map = new HashMap<>();
        // Large Horror Zombie Scale Matrix
        map.put("normal", new EnemyConfig("normal", "Walker Horror Zombie", 90, 1.8, 12, 26, new Color(45, 75, 45), 100, 1.0, false, 35, 1000));
        map.put("fast", new EnemyConfig("fast", "Sprinting Mutated Chaser", 60, 3.4, 14, 28, new Color(180, 75, 30), 150, 1.0, false, 32, 800));
        map.put("tank", new EnemyConfig("tank", "Goliath Brute Tank", 320, 1.1, 28, 36, new Color(75, 85, 95), 300, 1.0, false, 48, 1200));
        map.put("ranged", new EnemyConfig("ranged", "Toxic Acid Spitter", 85, 1.6, 16, 27, new Color(130, 90, 200), 200, 1.0, false, 360, 2200));
        map.put("armored", new EnemyConfig("armored", "Armored Juggernaut Zombie", 450, 1.3, 24, 32, new Color(55, 65, 80), 400, 0.5, false, 42, 1100));
        map.put("miniboss", new EnemyConfig("miniboss", "Fortress Dread Commander", 1000, 1.7, 38, 40, new Color(200, 45, 45), 1200, 0.8, true, 52, 1000));
        map.put("boss", new EnemyConfig("boss", "OVERLORD ZOMBIE KING", 3200, 1.5, 50, 46, new Color(160, 110, 220), 5000, 0.7, true, 58, 900));
        return map;
    }
}
