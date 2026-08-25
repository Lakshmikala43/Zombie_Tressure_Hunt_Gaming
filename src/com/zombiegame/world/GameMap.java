package com.zombiegame.world;

import com.zombiegame.config.LevelConfig;

import java.awt.*;
import java.util.List;

public class GameMap {
    public int levelId = 1;
    public int width;
    public int height;
    public Color groundColor;
    public Color gridColor;
    public Color obstacleColor;
    public Color obstacleBorderColor;
    public List<LevelConfig.ObstacleShape> obstacles;

    public GameMap(LevelConfig levelConfig) {
        loadLevel(levelConfig);
    }

    public void loadLevel(LevelConfig levelConfig) {
        this.levelId = levelConfig.id;
        this.width = levelConfig.worldWidth;
        this.height = levelConfig.worldHeight;
        this.groundColor = levelConfig.groundColor;
        this.gridColor = levelConfig.gridColor;
        this.obstacleColor = levelConfig.obstacleColor;
        this.obstacleBorderColor = levelConfig.obstacleBorderColor;
        this.obstacles = levelConfig.obstacles;
    }

    public boolean checkCollision(double x, double y, double radius) {
        if (x - radius < 0 || x + radius > width || y - radius < 0 || y + radius > height) {
            return true;
        }

        for (LevelConfig.ObstacleShape obs : obstacles) {
            if ("rect".equals(obs.type)) {
                double closestX = Math.max(obs.x, Math.min(x, obs.x + obs.width));
                double closestY = Math.max(obs.y, Math.min(y, obs.y + obs.height));
                double dx = x - closestX;
                double dy = y - closestY;
                if ((dx * dx + dy * dy) < (radius * radius)) {
                    return true;
                }
            } else if ("circle".equals(obs.type)) {
                double dx = x - obs.x;
                double dy = y - obs.y;
                double minDist = radius + obs.radius;
                if ((dx * dx + dy * dy) < (minDist * minDist)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void renderTerrain(Graphics2D g2d) {
        Graphics2D g = (Graphics2D) g2d.create();

        // 1. Render Environment Ground Textures per Level Location
        if (levelId == 1) { // Abandoned Village — Cobblestone & Dirt Paths
            g.setColor(new Color(26, 34, 26));
            g.fillRect(0, 0, width, height);

            // Cobblestone Paving Lines
            g.setColor(new Color(40, 52, 40));
            g.setStroke(new BasicStroke(1.5f));
            for (int x = 0; x < width; x += 40) {
                for (int y = 0; y < height; y += 30) {
                    int offsetX = (y / 30 % 2 == 0) ? 0 : 20;
                    g.drawRect(x + offsetX, y, 38, 28);
                }
            }
        } else if (levelId == 2) { // Dark Forest — Mossy Soil & Fallen Leaves
            g.setColor(new Color(13, 26, 16));
            g.fillRect(0, 0, width, height);

            // Leaf & Moss Spots
            g.setColor(new Color(20, 45, 25));
            for (int x = 50; x < width; x += 120) {
                for (int y = 50; y < height; y += 100) {
                    g.fillOval(x, y, 60, 40);
                }
            }
        } else if (levelId == 3) { // Haunted Hospital — Checked Floor Tiles
            g.setColor(new Color(26, 32, 44));
            g.fillRect(0, 0, width, height);

            // Hospital Floor Tiles
            int tileSize = 60;
            for (int x = 0; x < width; x += tileSize) {
                for (int y = 0; y < height; y += tileSize) {
                    if ((x / tileSize + y / tileSize) % 2 == 0) {
                        g.setColor(new Color(36, 45, 60));
                        g.fillRect(x, y, tileSize, tileSize);
                    }
                }
            }
            // Blood Stains on Hospital Floor
            g.setColor(new Color(120, 20, 20, 180));
            g.fillOval(400, 300, 120, 80);
            g.fillOval(900, 700, 140, 90);
        } else if (levelId == 4) { // Old Cemetery — Graveyard Soil & Tomb Slabs
            g.setColor(new Color(23, 25, 35));
            g.fillRect(0, 0, width, height);

            g.setColor(new Color(35, 40, 55));
            for (int x = 0; x < width; x += 80) {
                g.drawLine(x, 0, x, height);
            }
        } else if (levelId == 5) { // Abandoned Factory — Metal Diamond Plates & Hazard Lines
            g.setColor(new Color(35, 31, 32));
            g.fillRect(0, 0, width, height);

            // Industrial Hazard Stripes
            g.setColor(new Color(214, 158, 46, 120));
            g.setStroke(new BasicStroke(8));
            for (int x = -height; x < width + height; x += 60) {
                g.drawLine(x, 0, x + height, height);
            }
        } else if (levelId == 6) { // Military Base — Concrete Slabs & Tactical Danger Zones
            g.setColor(new Color(26, 32, 44));
            g.fillRect(0, 0, width, height);

            g.setColor(new Color(42, 54, 73));
            g.setStroke(new BasicStroke(2));
            int slab = 100;
            for (int x = 0; x < width; x += slab) {
                for (int y = 0; y < height; y += slab) {
                    g.drawRect(x, y, slab, slab);
                }
            }
        } else if (levelId == 7) { // Underground Lab — Cyan Grid & Toxic Acid Pools
            g.setColor(new Color(9, 37, 35));
            g.fillRect(0, 0, width, height);

            // Glowing Toxic Acid Pools
            g.setColor(new Color(0, 255, 136, 100));
            g.fillOval(350, 400, 180, 120);
            g.fillOval(1000, 600, 220, 150);

            g.setColor(new Color(16, 60, 57));
            g.setStroke(new BasicStroke(1));
            for (int x = 0; x < width; x += 50) g.drawLine(x, 0, x, height);
            for (int y = 0; y < height; y += 50) g.drawLine(0, y, width, y);
        } else if (levelId == 8) { // Ruined City — Asphalt Road & Brick Facades
            g.setColor(new Color(26, 22, 37));
            g.fillRect(0, 0, width, height);

            // Asphalt Road Lane Lines
            g.setColor(new Color(255, 215, 0, 140));
            g.setStroke(new BasicStroke(4));
            for (int y = 0; y < height; y += 60) {
                g.drawLine(width / 2, y, width / 2, y + 35);
            }
        } else if (levelId == 9) { // Zombie Fortress — Medieval Stone Blocks & Torches
            g.setColor(new Color(35, 21, 24));
            g.fillRect(0, 0, width, height);

            g.setColor(new Color(59, 30, 35));
            g.setStroke(new BasicStroke(2));
            for (int x = 0; x < width; x += 70) {
                for (int y = 0; y < height; y += 40) {
                    int offset = (y / 40 % 2 == 0) ? 0 : 35;
                    g.drawRect(x + offset, y, 68, 38);
                }
            }
        } else { // Level 10 — Overlord's Island (Obsidian Stone & Purple Magma Cracks)
            g.setColor(new Color(26, 15, 46));
            g.fillRect(0, 0, width, height);

            // Glowing Purple Magma Cracks
            g.setColor(new Color(183, 148, 244, 150));
            g.setStroke(new BasicStroke(3));
            g.drawLine(200, 300, 500, 700);
            g.drawLine(500, 700, 900, 400);
            g.drawLine(900, 400, 1300, 800);
        }

        // 2. Render Environment Building Obstacles with Wall Textures
        for (LevelConfig.ObstacleShape obs : obstacles) {
            if ("rect".equals(obs.type)) {
                // Outer Brick/Metal Wall Texture
                GradientPaint wallGrad = new GradientPaint(
                        obs.x, obs.y, obstacleColor,
                        obs.x + obs.width, obs.y + obs.height, obstacleColor.darker()
                );
                g.setPaint(wallGrad);
                g.fillRect(obs.x, obs.y, obs.width, obs.height);

                g.setColor(obstacleBorderColor);
                g.setStroke(new BasicStroke(3));
                g.drawRect(obs.x, obs.y, obs.width, obs.height);

                if (obs.label != null) {
                    g.setFont(new Font("Dialog", Font.BOLD, 12));
                    g.setColor(obs.label.contains("DOOR") ? new Color(0, 255, 136) : new Color(255, 255, 255, 180));
                    g.drawString(obs.label, obs.x + 8, obs.y + obs.height / 2 + 4);
                }
            } else if ("circle".equals(obs.type)) {
                GradientPaint circleGrad = new GradientPaint(
                        obs.x - obs.radius, obs.y - obs.radius, obstacleColor,
                        obs.x + obs.radius, obs.y + obs.radius, obstacleColor.darker()
                );
                g.setPaint(circleGrad);
                g.fillOval(obs.x - obs.radius, obs.y - obs.radius, obs.radius * 2, obs.radius * 2);

                g.setColor(obstacleBorderColor);
                g.setStroke(new BasicStroke(3));
                g.drawOval(obs.x - obs.radius, obs.y - obs.radius, obs.radius * 2, obs.radius * 2);

                if (obs.label != null) {
                    g.setFont(new Font("Dialog", Font.BOLD, 11));
                    g.setColor(new Color(255, 255, 255, 180));
                    g.drawString(obs.label, obs.x - 20, obs.y + 4);
                }
            }
        }

        g.dispose();
    }
}
