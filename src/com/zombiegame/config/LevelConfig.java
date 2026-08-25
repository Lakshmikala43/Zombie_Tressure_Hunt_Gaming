package com.zombiegame.config;

import java.awt.Color;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

public class LevelConfig {
    public int id;
    public String name;
    public String subtitle;
    public Color groundColor;
    public Color gridColor;
    public Color obstacleColor;
    public Color obstacleBorderColor;
    public int worldWidth;
    public int worldHeight;
    public Point playerSpawn;
    public Point treasurePos;
    public int rewardWeaponId;
    public boolean isBossLevel;
    public String[] clues;

    public static class KeySpawn {
        public int id;
        public Point pos;
        public String guardianType;
        public int guardianCount;
        public Point guardianSpawn;

        public KeySpawn(int id, Point pos, String guardianType, int guardianCount, Point guardianSpawn) {
            this.id = id;
            this.pos = pos;
            this.guardianType = guardianType;
            this.guardianCount = guardianCount;
            this.guardianSpawn = guardianSpawn;
        }
    }

    public static class RoamingSpawn {
        public String type;
        public Point pos;

        public RoamingSpawn(String type, Point pos) {
            this.type = type;
            this.pos = pos;
        }
    }

    public static class ObstacleShape {
        public String type; // "rect" or "circle"
        public int x, y, width, height, radius;
        public String label;

        public ObstacleShape(int x, int y, int width, int height, String label) {
            this.type = "rect";
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.label = label;
        }

        public ObstacleShape(int x, int y, int radius, String label) {
            this.type = "circle";
            this.x = x;
            this.y = y;
            this.radius = radius;
            this.label = label;
        }
    }

    public List<KeySpawn> keys = new ArrayList<>();
    public List<RoamingSpawn> roamingZombies = new ArrayList<>();
    public List<ObstacleShape> obstacles = new ArrayList<>();

    public LevelConfig(int id, String name, String subtitle, Color ground, Color grid, Color obs, Color obsBorder, int width, int height, Point spawn, Point treasure, int rewardWeaponId, boolean isBossLevel, String[] clues) {
        this.id = id;
        this.name = name;
        this.subtitle = subtitle;
        this.groundColor = ground;
        this.gridColor = grid;
        this.obstacleColor = obs;
        this.obstacleBorderColor = obsBorder;
        this.worldWidth = width;
        this.worldHeight = height;
        this.playerSpawn = spawn;
        this.treasurePos = treasure;
        this.rewardWeaponId = rewardWeaponId;
        this.isBossLevel = isBossLevel;
        this.clues = clues;
    }

    private static void addHouseWithDoorway(List<ObstacleShape> obstacles, int x, int y, int w, int h, String name) {
        int wallT = 15;
        // North wall
        obstacles.add(new ObstacleShape(x, y, w, wallT, name));
        // West wall
        obstacles.add(new ObstacleShape(x, y, wallT, h, null));
        // East wall
        obstacles.add(new ObstacleShape(x + w - wallT, y, wallT, h, null));
        // South wall left segment (leaving a 70px doorway gap in middle)
        int doorW = 70;
        int segW = (w - doorW) / 2;
        obstacles.add(new ObstacleShape(x, y + h - wallT, segW, wallT, "DOOR 🚪"));
        obstacles.add(new ObstacleShape(x + segW + doorW, y + h - wallT, segW, wallT, null));
    }

    public static List<LevelConfig> getAllLevels() {
        List<LevelConfig> list = new ArrayList<>();

        // Level 1 — Abandoned Village
        LevelConfig l1 = new LevelConfig(1, "Abandoned Village", "Search ruined cottages for 4 hidden keys.",
                new Color(26, 34, 26), new Color(36, 51, 36), new Color(58, 42, 26), new Color(101, 67, 33),
                1600, 1200, new Point(200, 200), new Point(1450, 1050), 2, false,
                new String[]{
                        "🧩 CLUE 1: Key 1 is inside the Northern wooden cottage room.",
                        "🧩 CLUE 2: Key 2 lies inside the Eastern farm barn doorway.",
                        "🧩 CLUE 3: Check near the Southern stone well in the courtyard.",
                        "🧩 CLUE 4: Key 4 is guarded inside the Western cottage."
                });
        // Key 1 inside House at (720, 190)
        l1.keys.add(new KeySpawn(1, new Point(720, 190), "normal", 2, new Point(720, 210)));
        // Key 2 inside Barn at (1300, 320)
        l1.keys.add(new KeySpawn(2, new Point(1300, 320), "normal", 3, new Point(1300, 340)));
        // Key 3 near Well courtyard (800, 950)
        l1.keys.add(new KeySpawn(3, new Point(800, 950), "fast", 2, new Point(820, 930)));
        // Key 4 inside West Cottage at (210, 780)
        l1.keys.add(new KeySpawn(4, new Point(210, 780), "tank", 1, new Point(220, 800)));

        l1.roamingZombies.add(new RoamingSpawn("normal", new Point(500, 400)));
        l1.roamingZombies.add(new RoamingSpawn("normal", new Point(900, 600)));
        l1.roamingZombies.add(new RoamingSpawn("fast", new Point(1100, 750)));

        // Houses with open doorways for smooth entry!
        addHouseWithDoorway(l1.obstacles, 600, 100, 250, 180, "North House");
        addHouseWithDoorway(l1.obstacles, 1200, 200, 200, 250, "East Barn");
        l1.obstacles.add(new ObstacleShape(800, 600, 45, "Well"));
        addHouseWithDoorway(l1.obstacles, 100, 700, 220, 180, "West Cottage");
        list.add(l1);

        // Levels 2 through 10
        for (int i = 2; i <= 10; i++) {
            boolean isBoss = (i == 10);
            String name = switch (i) {
                case 2 -> "Dark Forest";
                case 3 -> "Haunted Hospital";
                case 4 -> "Old Cemetery";
                case 5 -> "Abandoned Factory";
                case 6 -> "Military Base";
                case 7 -> "Underground Laboratory";
                case 8 -> "Ruined City";
                case 9 -> "Zombie Fortress";
                default -> "Final Battle — Overlord's Island";
            };
            Color gColor = new Color(15 + i * 2, 20 + i * 3, 30 + i * 2);
            LevelConfig cfg = new LevelConfig(i, name, "Survive the escalating infection and collect 4 keys.",
                    gColor, new Color(30, 40, 55), new Color(40, 50, 70), new Color(0, 229, 255),
                    1600, 1200, new Point(150, 150), new Point(1450, 1050), Math.min(i + 1, 10), isBoss,
                    new String[]{
                            "🧩 CLUE 1: Key 1 is guarded inside Sector Alpha chamber.",
                            "🧩 CLUE 2: Key 2 is hidden inside the Eastern structure.",
                            "🧩 CLUE 3: Search the Southern vault area.",
                            "🧩 CLUE 4: Defeat the key guardian to unlock the final treasure!"
                    });
            String gType = (i < 4) ? "normal" : (i < 7) ? "armored" : (i < 9) ? "miniboss" : "boss";
            cfg.keys.add(new KeySpawn(1, new Point(780, 220), "fast", 3, new Point(780, 240)));
            cfg.keys.add(new KeySpawn(2, new Point(1280, 320), "ranged", 3, new Point(1280, 340)));
            cfg.keys.add(new KeySpawn(3, new Point(350, 950), "tank", 2, new Point(330, 930)));
            cfg.keys.add(new KeySpawn(4, new Point(1100, 850), gType, 1, new Point(1080, 830)));
            cfg.roamingZombies.add(new RoamingSpawn("fast", new Point(500, 350)));
            cfg.roamingZombies.add(new RoamingSpawn("normal", new Point(1000, 450)));

            addHouseWithDoorway(cfg.obstacles, 650, 150, 280, 180, "Bunker");
            addHouseWithDoorway(cfg.obstacles, 1150, 200, 250, 200, "Depot");
            cfg.obstacles.add(new ObstacleShape(300, 750, 60, "Reactor"));
            list.add(cfg);
        }

        return list;
    }
}
