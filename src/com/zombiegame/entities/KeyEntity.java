package com.zombiegame.entities;

import com.zombiegame.engine.SoundEngine;

import java.awt.*;

public class KeyEntity extends Entity {
    public int id;
    public boolean isRevealed = false;
    public boolean isCollected = false;
    public double floatOffset = Math.random() * Math.PI * 2;

    public KeyEntity(int id, double x, double y) {
        super(x, y, 18);
        this.id = id;
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
            SoundEngine.getInstance().playKeyPickup();
        }
    }

    public void render(Graphics2D g2d) {
        if (!isRevealed || isCollected) return;

        floatOffset += 0.05;
        double offsetY = Math.sin(floatOffset) * 6;

        Graphics2D g = (Graphics2D) g2d.create();
        g.translate(x, y + offsetY);

        // Pulsing Golden Aura
        g.setColor(new Color(255, 215, 0, 110));
        g.fillOval(-25, -25, 50, 50);

        // Key Graphic (Metallic Gold Ring, Shaft & Teeth)
        g.setColor(new Color(255, 215, 0));
        g.setStroke(new BasicStroke(3));
        g.drawOval(-12, -8, 14, 14); // Ring handle
        g.fillRect(-2, -2, 16, 4);   // Shaft
        g.fillRect(8, 2, 4, 6);     // Tooth 1
        g.fillRect(12, 2, 4, 4);    // Tooth 2

        // Specular highlight
        g.setColor(Color.WHITE);
        g.fillOval(-10, -6, 4, 4);

        g.setFont(new Font("Dialog", Font.BOLD, 11));
        g.setColor(new Color(255, 215, 0));
        g.drawString("[E] KEY " + id, -22, 22);

        g.dispose();
    }
}
