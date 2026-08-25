package com.zombiegame.entities;

import com.zombiegame.engine.SoundEngine;

import java.awt.*;

public class ClueEntity extends Entity {
    public int index;
    public String clueText;
    public boolean isRevealed = false;
    public boolean isCollected = false;
    public double floatOffset = Math.random() * Math.PI * 2;

    public ClueEntity(int index, double x, double y, String clueText) {
        super(x, y, 18);
        this.index = index;
        this.clueText = clueText;
    }

    public void reveal() {
        if (!isRevealed) {
            isRevealed = true;
            SoundEngine.getInstance().playClueUnlock();
        }
    }

    public void collect() {
        if (!isCollected) {
            isCollected = true;
            SoundEngine.getInstance().playClueUnlock();
        }
    }

    public void render(Graphics2D g2d) {
        if (!isRevealed || isCollected) return;

        floatOffset += 0.05;
        double offsetY = Math.sin(floatOffset) * 5;

        Graphics2D g = (Graphics2D) g2d.create();
        g.translate(x, y + offsetY);

        // Glowing Cyan Compass Aura
        g.setColor(new Color(0, 229, 255, 110));
        g.fillOval(-25, -25, 50, 50);

        // Parchment Scroll Graphic
        g.setColor(new Color(245, 235, 200)); // Parchment paper
        g.fillRect(-12, -10, 24, 18);
        g.setColor(new Color(139, 69, 19)); // Border
        g.drawRect(-12, -10, 24, 18);
        g.drawLine(-8, -4, 8, -4); // Map line 1
        g.drawLine(-8, 2, 4, 2);   // Map line 2

        // Red Wax Seal
        g.setColor(new Color(200, 30, 30));
        g.fillOval(2, 0, 6, 6);

        g.setFont(new Font("Dialog", Font.BOLD, 12));
        g.setColor(new Color(0, 229, 255));
        g.drawString("[E] GRAB CLUE", -45, -24);

        g.dispose();
    }
}
