package com.zombiegame.engine;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.HashSet;
import java.util.Set;

public class InputHandler {
    private final Set<Integer> activeKeys = new HashSet<>();
    public int mouseX = 0;
    public int mouseY = 0;
    public double mouseWorldX = 0;
    public double mouseWorldY = 0;
    public boolean mouseDown = false;
    public boolean mousePressed = false;
    public boolean interactPressed = false;
    public boolean cluePressed = false;
    public boolean pausePressed = false;

    public KeyAdapter getKeyListener() {
        return new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                activeKeys.add(e.getKeyCode());
                if (e.getKeyCode() == KeyEvent.VK_E) interactPressed = true;
                if (e.getKeyCode() == KeyEvent.VK_C) cluePressed = true;
                if (e.getKeyCode() == KeyEvent.VK_ESCAPE) pausePressed = true;
            }

            @Override
            public void keyReleased(KeyEvent e) {
                activeKeys.remove(e.getKeyCode());
            }
        };
    }

    public MouseAdapter getMouseListener() {
        return new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                mouseX = e.getX();
                mouseY = e.getY();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    mouseDown = true;
                    mousePressed = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    mouseDown = false;
                }
            }
        };
    }

    public void updateMouseWorld(double cameraX, double cameraY) {
        mouseWorldX = mouseX + cameraX;
        mouseWorldY = mouseY + cameraY;
    }

    public void resetFrameFlags() {
        mousePressed = false;
        interactPressed = false;
        cluePressed = false;
        pausePressed = false;
    }

    public boolean isMovingUp() {
        return activeKeys.contains(KeyEvent.VK_W) || activeKeys.contains(KeyEvent.VK_UP);
    }

    public boolean isMovingDown() {
        return activeKeys.contains(KeyEvent.VK_S) || activeKeys.contains(KeyEvent.VK_DOWN);
    }

    public boolean isMovingLeft() {
        return activeKeys.contains(KeyEvent.VK_A) || activeKeys.contains(KeyEvent.VK_LEFT);
    }

    public boolean isMovingRight() {
        return activeKeys.contains(KeyEvent.VK_D) || activeKeys.contains(KeyEvent.VK_RIGHT);
    }

    public boolean isAttacking() {
        return mouseDown || activeKeys.contains(KeyEvent.VK_SPACE);
    }
}
