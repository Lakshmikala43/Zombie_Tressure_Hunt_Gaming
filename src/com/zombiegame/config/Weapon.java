package com.zombiegame.config;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class Weapon {
    public int id;
    public String name;
    public String icon;
    public int damage;
    public int fireRate; // ms
    public int range;
    public double speed;
    public double spread;
    public int pellets;
    public int maxAmmo;
    public int reloadTime; // ms
    public Color color;
    public String description;

    public Weapon(int id, String name, String icon, int damage, int fireRate, int range, double speed, double spread, int pellets, int maxAmmo, int reloadTime, Color color, String description) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.damage = damage;
        this.fireRate = fireRate;
        this.range = range;
        this.speed = speed;
        this.spread = spread;
        this.pellets = pellets;
        this.maxAmmo = maxAmmo;
        this.reloadTime = reloadTime;
        this.color = color;
        this.description = description;
    }

    public static List<Weapon> getAllWeapons() {
        List<Weapon> list = new ArrayList<>();
        list.add(new Weapon(1, "Basic Pistol", "🔫", 25, 350, 450, 14.0, 0.05, 1, 12, 1200, new Color(255, 215, 0), "Reliable sidearm with good accuracy."));
        list.add(new Weapon(2, "Tactical Shotgun", "💥", 18, 650, 380, 12.0, 0.25, 6, 8, 1800, new Color(255, 85, 51), "Fires multiple pellets for devastation at close range."));
        list.add(new Weapon(3, "Assault Rifle", "⚡", 30, 130, 550, 16.0, 0.08, 1, 30, 1500, new Color(51, 255, 136), "High automatic fire rate to suppress zombie hordes."));
        list.add(new Weapon(4, "Hunter Crossbow", "🏹", 85, 750, 700, 18.0, 0.01, 1, 10, 1400, new Color(0, 229, 255), "Deadly silent armor-piercing bolts."));
        list.add(new Weapon(5, "Heavy Combat Rifle", "💣", 55, 200, 600, 16.0, 0.06, 1, 25, 1600, new Color(255, 170, 0), "Heavy stopping power against armored targets."));
        list.add(new Weapon(6, "Advanced Shotgun", "🔥", 24, 450, 420, 14.0, 0.20, 8, 12, 1600, new Color(255, 0, 85), "Rapid fire semi-auto shotgun with explosive impact."));
        list.add(new Weapon(7, "Plasma Energy Blaster", "🔮", 75, 220, 650, 20.0, 0.02, 1, 20, 1300, new Color(0, 255, 255), "Concentrated energy bursts that disintegrate flesh."));
        list.add(new Weapon(8, "Power Destroyer Rifle", "⚡", 95, 160, 750, 20.0, 0.04, 1, 35, 1500, new Color(170, 0, 255), "High-voltage kinetic rifle with rapid fire capability."));
        list.add(new Weapon(9, "Legendary Annihilator", "🌟", 140, 120, 850, 22.0, 0.03, 1, 40, 1200, new Color(255, 0, 255), "Legendary experimental prototype weapon."));
        list.add(new Weapon(10, "Ultimate Omega Cannon", "👑", 250, 90, 1000, 24.0, 0.01, 2, 99, 800, new Color(255, 255, 0), "The ultimate weapon capable of destroying entire zombie armies."));
        return list;
    }
}
