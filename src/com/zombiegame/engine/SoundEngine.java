package com.zombiegame.engine;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.SourceDataLine;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SoundEngine {
    private static final SoundEngine instance = new SoundEngine();
    private boolean muted = false;
    private final ExecutorService executor = Executors.newCachedThreadPool();
    private static final float SAMPLE_RATE = 44100f;

    private SoundEngine() {}

    public static SoundEngine getInstance() {
        return instance;
    }

    public boolean isMuted() {
        return muted;
    }

    public void setMuted(boolean muted) {
        this.muted = muted;
    }

    public void playShoot(String weaponName) {
        if (muted) return;

        executor.submit(() -> {
            try {
                AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
                SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
                sdl.open(af);
                sdl.start();

                int durationMs = 180;
                if (weaponName.contains("Shotgun") || weaponName.contains("Destroyer")) {
                    durationMs = 280;
                } else if (weaponName.contains("Cannon") || weaponName.contains("Annihilator")) {
                    durationMs = 340;
                }

                int numSamples = (int) (SAMPLE_RATE * (durationMs / 1000f));
                byte[] buffer = new byte[numSamples];

                for (int i = 0; i < numSamples; i++) {
                    float progress = (float) i / numSamples;
                    float timeSec = i / SAMPLE_RATE;

                    // 1. Supersonic Crack Snap (0-15ms)
                    float crack = 0f;
                    if (timeSec < 0.015f) {
                        crack = (float) (Math.random() * 2.0 - 1.0) * 1.4f;
                    }

                    // 2. High-Pressure Gunpowder Gas Expansion Blast (15-70ms)
                    float gasBlast = 0f;
                    if (timeSec >= 0.005f && timeSec < 0.08f) {
                        float n = (float) (Math.random() * 2.0 - 1.0);
                        float blastEnv = (float) Math.sin((timeSec - 0.005f) / 0.075f * Math.PI);
                        gasBlast = n * blastEnv * 1.1f;
                    }

                    // 3. 5.56mm / 7.62mm Sub-Bass Kinetic Recoil Thud (0-100ms)
                    float currentFreq = 260f - (progress * 220f);
                    float bassAngle = (float) (2.0 * Math.PI * currentFreq * i / SAMPLE_RATE);
                    float bassThud = (float) Math.sin(bassAngle) * 0.9f;

                    // 4. Mechanical Bolt Slide & Brass Ejection Click (45-80ms)
                    float mechanicalClick = 0f;
                    if (timeSec >= 0.045f && timeSec < 0.075f) {
                        float metallicAngle = (float) (2.0 * Math.PI * 1800f * i / SAMPLE_RATE);
                        mechanicalClick = (float) Math.sin(metallicAngle) * 0.3f;
                    }

                    // Combined Military Gunshot Waveform
                    float combined = crack + gasBlast + bassThud + mechanicalClick;

                    // Exponential Acoustic Tail Reverb Envelope
                    float decayEnv = (float) Math.pow(1.0 - progress, 2.5);

                    buffer[i] = (byte) Math.max(-127, Math.min(127, combined * decayEnv * 95));
                }

                sdl.write(buffer, 0, buffer.length);
                sdl.drain();
                sdl.close();
            } catch (Exception ignored) {}
        });
    }

    public void playZombieGroan() {
        if (muted) return;
        executor.submit(() -> {
            try {
                AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
                SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
                sdl.open(af);
                sdl.start();

                int numSamples = (int) (SAMPLE_RATE * 0.45f);
                byte[] buffer = new byte[numSamples];

                for (int i = 0; i < numSamples; i++) {
                    float progress = (float) i / numSamples;
                    float freq = 85f - (progress * 40f);
                    float angle = (float) (2.0 * Math.PI * freq * i / SAMPLE_RATE);
                    float sample = (float) (Math.sin(angle) * 0.6 + (Math.random() * 0.4 - 0.2));
                    float env = 1.0f - progress;
                    buffer[i] = (byte) (sample * env * 50);
                }

                sdl.write(buffer, 0, buffer.length);
                sdl.drain();
                sdl.close();
            } catch (Exception ignored) {}
        });
    }

    public void playHit() {
        if (muted) return;
        playTone(180, 30, 80, "sawtooth", 0.4f);
    }

    public void playPlayerHurt() {
        if (muted) return;
        playTone(220, 70, 200, "sawtooth", 0.7f);
    }

    public void playKeyPickup() {
        if (muted) return;
        executor.submit(() -> {
            playTone(523.25f, 523.25f, 80, "sine", 0.6f);
            try { Thread.sleep(60); } catch (Exception ignored) {}
            playTone(659.25f, 659.25f, 80, "sine", 0.6f);
            try { Thread.sleep(60); } catch (Exception ignored) {}
            playTone(783.99f, 783.99f, 120, "sine", 0.6f);
        });
    }

    public void playClueUnlock() {
        if (muted) return;
        executor.submit(() -> {
            playTone(440f, 440f, 100, "sine", 0.5f);
            try { Thread.sleep(80); } catch (Exception ignored) {}
            playTone(554.37f, 554.37f, 100, "sine", 0.5f);
            try { Thread.sleep(80); } catch (Exception ignored) {}
            playTone(659.25f, 659.25f, 150, "sine", 0.6f);
        });
    }

    public void playTreasureOpen() {
        if (muted) return;
        executor.submit(() -> {
            float[] notes = {440f, 554.37f, 659.25f, 880f};
            for (float n : notes) {
                playTone(n, n, 120, "sine", 0.7f);
                try { Thread.sleep(100); } catch (Exception ignored) {}
            }
        });
    }

    public void playGameOver() {
        if (muted) return;
        executor.submit(() -> {
            float[] notes = {300f, 240f, 180f, 120f};
            for (float n : notes) {
                playTone(n, n, 150, "sawtooth", 0.6f);
                try { Thread.sleep(140); } catch (Exception ignored) {}
            }
        });
    }

    private void playTone(float freqStart, float freqEnd, int durationMs, String waveType, float volume) {
        executor.submit(() -> {
            try {
                AudioFormat af = new AudioFormat(SAMPLE_RATE, 8, 1, true, false);
                SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
                sdl.open(af);
                sdl.start();

                int numSamples = (int) (SAMPLE_RATE * (durationMs / 1000f));
                byte[] buffer = new byte[numSamples];

                for (int i = 0; i < numSamples; i++) {
                    float progress = (float) i / numSamples;
                    float currentFreq = freqStart + (freqEnd - freqStart) * progress;
                    float angle = (float) (2.0 * Math.PI * currentFreq * i / SAMPLE_RATE);
                    float sample = (float) Math.sin(angle);

                    float env = 1.0f - progress;
                    buffer[i] = (byte) (sample * env * volume * 127);
                }

                sdl.write(buffer, 0, buffer.length);
                sdl.drain();
                sdl.close();
            } catch (Exception ignored) {}
        });
    }
}
