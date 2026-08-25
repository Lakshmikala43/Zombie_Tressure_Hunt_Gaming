package com.zombiegame.entities;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParticleEngine {
    public static class Particle {
        public double x, y, vx, vy, radius, alpha = 1.0, decay;
        public Color color;

        public Particle(double x, double y, double vx, double vy, double radius, Color color, double decay) {
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
            this.radius = radius;
            this.color = color;
            this.decay = decay;
        }
    }

    public static class DamageText {
        public double x, y, vy = -1.2, alpha = 1.0;
        public String text;
        public Color color;
        public int fontSize;

        public DamageText(double x, double y, String text, Color color, int fontSize) {
            this.x = x;
            this.y = y;
            this.text = text;
            this.color = color;
            this.fontSize = fontSize;
        }
    }

    private final List<Particle> particles = new ArrayList<>();
    private final List<DamageText> damageTexts = new ArrayList<>();

    public void createBloodSpatter(double x, double y, int count) {
        for (int i = 0; i < count; i++) {
            double angle = Math.random() * Math.PI * 2;
            double speed = Math.random() * 3 + 1;
            particles.add(new Particle(
                    x, y,
                    Math.cos(angle) * speed, Math.sin(angle) * speed,
                    Math.random() * 3 + 2,
                    new Color(229, 62, 62),
                    Math.random() * 0.04 + 0.02
            ));
        }
    }

    public void createMuzzleFlash(double x, double y, Color color) {
        for (int i = 0; i < 5; i++) {
            double angle = Math.random() * Math.PI * 2;
            double speed = Math.random() * 2 + 1;
            particles.add(new Particle(
                    x, y,
                    Math.cos(angle) * speed, Math.sin(angle) * speed,
                    Math.random() * 4 + 2,
                    color,
                    0.1
            ));
        }
    }

    public void createZombieDeathEffect(double x, double y, Color color) {
        for (int i = 0; i < 15; i++) {
            double angle = Math.random() * Math.PI * 2;
            double speed = Math.random() * 4 + 1;
            particles.add(new Particle(
                    x, y,
                    Math.cos(angle) * speed, Math.sin(angle) * speed,
                    Math.random() * 5 + 3,
                    color,
                    Math.random() * 0.03 + 0.015
            ));
        }
    }

    public void addDamageText(double x, double y, int amount, boolean isCrit) {
        String text = isCrit ? "CRIT! -" + amount : "-" + amount;
        Color color = isCrit ? new Color(255, 215, 0) : Color.WHITE;
        damageTexts.add(new DamageText(x, y, text, color, isCrit ? 18 : 14));
    }

    public void update() {
        Iterator<Particle> pIt = particles.iterator();
        while (pIt.hasNext()) {
            Particle p = pIt.next();
            p.x += p.vx;
            p.y += p.vy;
            p.alpha -= p.decay;
            if (p.alpha <= 0) pIt.remove();
        }

        Iterator<DamageText> dIt = damageTexts.iterator();
        while (dIt.hasNext()) {
            DamageText dt = dIt.next();
            dt.y += dt.vy;
            dt.alpha -= 0.02;
            if (dt.alpha <= 0) dIt.remove();
        }
    }

    public void render(Graphics2D g2d) {
        for (Particle p : particles) {
            float alpha = (float) Math.max(0, p.alpha);
            g2d.setColor(new Color(p.color.getRed(), p.color.getGreen(), p.color.getBlue(), (int) (alpha * 255)));
            g2d.fillOval((int) (p.x - p.radius), (int) (p.y - p.radius), (int) (p.radius * 2), (int) (p.radius * 2));
        }

        for (DamageText dt : damageTexts) {
            float alpha = (float) Math.max(0, dt.alpha);
            g2d.setFont(new Font("Dialog", Font.BOLD, dt.fontSize));
            g2d.setColor(new Color(dt.color.getRed(), dt.color.getGreen(), dt.color.getBlue(), (int) (alpha * 255)));
            g2d.drawString(dt.text, (int) dt.x, (int) dt.y);
        }
    }
}
