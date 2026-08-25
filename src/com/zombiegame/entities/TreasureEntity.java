package com.zombiegame.entities;

import com.zombiegame.engine.SoundEngine;

import java.awt.*;

public class TreasureEntity extends Entity {
    public boolean isUnlocked = false; // All 4 keys collected
    public boolean isOpened = false;
    public double pulse = 0;

    public TreasureEntity(double x, double y) {
        super(x, y, 28);
    }

    public void unlock() {
        if (!isUnlocked) {
            isUnlocked = true;
            SoundEngine.getInstance().playClueUnlock();
        }
    }

    public void open() {
        if (isUnlocked && !isOpened) {
            isOpened = true;
            SoundEngine.getInstance().playTreasureOpen();
        }
    }

    public void render(Graphics2D g2d) {
        pulse += 0.05;

        Graphics2D g = (Graphics2D) g2d.create();
        g.translate(x, y);

        // Chest Base Drop Shadow
        g.setColor(new Color(0, 0, 0, 120));
        g.fillOval(-25, 10, 50, 20);

        if (isOpened) {
            // Open Wooden Treasure Chest Model
            g.setColor(new Color(101, 67, 33)); // Mahogany Wood
            g.fillRect(-22, -15, 44, 30);
            g.setColor(new Color(218, 165, 32)); // Brass Straps
            g.drawRect(-22, -15, 44, 30);
            g.drawLine(-8, -15, -8, 15);
            g.drawLine(8, -15, 8, 15);

            // Sparkling Jewels Inside
            g.setColor(new Color(255, 215, 0));
            g.fillOval(-12, -8, 8, 8);
            g.setColor(new Color(0, 255, 136));
            g.fillOval(2, -6, 8, 8);
            g.setColor(new Color(255, 51, 68));
            g.fillOval(-5, 0, 8, 8);

            g.setFont(new Font("SansSerif", Font.BOLD, 22));
            g.drawString("🎁", -12, -20);
        } else if (isUnlocked) {
            // Unlocked Glowing Treasure Chest Model
            int auraR = (int) (38 + Math.sin(pulse) * 8);
            g.setColor(new Color(255, 215, 0, 100));
            g.fillOval(-auraR, -auraR, auraR * 2, auraR * 2);

            // Wooden Chest Body
            g.setColor(new Color(139, 69, 19));
            g.fillRect(-22, -15, 44, 30);
            g.setColor(new Color(255, 215, 0)); // Golden Reinforcements
            g.setStroke(new BasicStroke(2.5f));
            g.drawRect(-22, -15, 44, 30);
            g.drawLine(-8, -15, -8, 15);
            g.drawLine(8, -15, 8, 15);

            // Golden Keyhole
            g.setColor(new Color(255, 215, 0));
            g.fillOval(-4, -4, 8, 8);
            g.fillRect(-2, 0, 4, 7);

            g.setFont(new Font("Dialog", Font.BOLD, 13));
            g.setColor(new Color(255, 215, 0));
            g.drawString("🔓 PRESS [E] TO OPEN", -65, -35);
        } else {
            // Locked Chest Model
            g.setColor(new Color(80, 45, 15));
            g.fillRect(-22, -15, 44, 30);
            g.setColor(new Color(120, 130, 140)); // Iron Straps
            g.setStroke(new BasicStroke(2));
            g.drawRect(-22, -15, 44, 30);
            g.drawLine(-8, -15, -8, 15);
            g.drawLine(8, -15, 8, 15);

            // Lock Padlock
            g.setColor(new Color(255, 85, 102));
            g.fillRect(-5, -3, 10, 10);
            g.drawArc(-4, -8, 8, 8, 0, 180);

            g.setFont(new Font("Dialog", Font.BOLD, 12));
            g.setColor(new Color(255, 85, 102));
            g.drawString("4 KEYS REQUIRED", -50, -32);
        }

        g.dispose();
    }
}
