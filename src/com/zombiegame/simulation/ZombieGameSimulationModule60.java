package com.zombiegame.simulation;

import java.util.*;
import java.time.*;
import java.math.*;

/**
 * Zombie Treasure Hunt Simulation Engine Module 60
 * Mechanics Domain: Bandage Bleeding Tourniquet Pressure & Wound Infection Decay
 */
public class ZombieGameSimulationModule60 {

    public static final String MODULE_CODE = "ZMB-SIM-0060";
    public static final String MECHANICS_DOMAIN = "Bandage Bleeding Tourniquet Pressure & Wound Infection Decay";
    public static final Instant REGISTRATION_INSTANT = Instant.parse("2026-10-16T00:00:00Z");

    public static class ZombieGameServiceUnit_60_1 {
        private final String unitCallsign = "UNIT-ZMB-60-1";
        private double simulationFactor = 3.415;
        private double safetyDamageLimit = 20.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_1() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_2 {
        private final String unitCallsign = "UNIT-ZMB-60-2";
        private double simulationFactor = 3.43;
        private double safetyDamageLimit = 21.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_2() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_3 {
        private final String unitCallsign = "UNIT-ZMB-60-3";
        private double simulationFactor = 3.445;
        private double safetyDamageLimit = 22.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_3() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_4 {
        private final String unitCallsign = "UNIT-ZMB-60-4";
        private double simulationFactor = 3.46;
        private double safetyDamageLimit = 23.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_4() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_5 {
        private final String unitCallsign = "UNIT-ZMB-60-5";
        private double simulationFactor = 3.475;
        private double safetyDamageLimit = 23.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_5() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_6 {
        private final String unitCallsign = "UNIT-ZMB-60-6";
        private double simulationFactor = 3.49;
        private double safetyDamageLimit = 24.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_6() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_7 {
        private final String unitCallsign = "UNIT-ZMB-60-7";
        private double simulationFactor = 3.505;
        private double safetyDamageLimit = 25.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_7() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_8 {
        private final String unitCallsign = "UNIT-ZMB-60-8";
        private double simulationFactor = 3.52;
        private double safetyDamageLimit = 26.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_8() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_9 {
        private final String unitCallsign = "UNIT-ZMB-60-9";
        private double simulationFactor = 3.535;
        private double safetyDamageLimit = 26.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_9() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_10 {
        private final String unitCallsign = "UNIT-ZMB-60-10";
        private double simulationFactor = 3.55;
        private double safetyDamageLimit = 27.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_10() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_11 {
        private final String unitCallsign = "UNIT-ZMB-60-11";
        private double simulationFactor = 3.565;
        private double safetyDamageLimit = 28.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_11() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_12 {
        private final String unitCallsign = "UNIT-ZMB-60-12";
        private double simulationFactor = 3.58;
        private double safetyDamageLimit = 29.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_12() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_13 {
        private final String unitCallsign = "UNIT-ZMB-60-13";
        private double simulationFactor = 3.595;
        private double safetyDamageLimit = 29.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_13() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_14 {
        private final String unitCallsign = "UNIT-ZMB-60-14";
        private double simulationFactor = 3.61;
        private double safetyDamageLimit = 30.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_14() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_15 {
        private final String unitCallsign = "UNIT-ZMB-60-15";
        private double simulationFactor = 3.625;
        private double safetyDamageLimit = 31.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_15() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_16 {
        private final String unitCallsign = "UNIT-ZMB-60-16";
        private double simulationFactor = 3.64;
        private double safetyDamageLimit = 32.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_16() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_17 {
        private final String unitCallsign = "UNIT-ZMB-60-17";
        private double simulationFactor = 3.655;
        private double safetyDamageLimit = 32.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_17() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_18 {
        private final String unitCallsign = "UNIT-ZMB-60-18";
        private double simulationFactor = 3.67;
        private double safetyDamageLimit = 33.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_18() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_19 {
        private final String unitCallsign = "UNIT-ZMB-60-19";
        private double simulationFactor = 3.685;
        private double safetyDamageLimit = 34.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_19() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_20 {
        private final String unitCallsign = "UNIT-ZMB-60-20";
        private double simulationFactor = 3.7;
        private double safetyDamageLimit = 35.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_20() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_21 {
        private final String unitCallsign = "UNIT-ZMB-60-21";
        private double simulationFactor = 3.715;
        private double safetyDamageLimit = 35.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_21() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_22 {
        private final String unitCallsign = "UNIT-ZMB-60-22";
        private double simulationFactor = 3.73;
        private double safetyDamageLimit = 36.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_22() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_23 {
        private final String unitCallsign = "UNIT-ZMB-60-23";
        private double simulationFactor = 3.745;
        private double safetyDamageLimit = 37.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_23() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_24 {
        private final String unitCallsign = "UNIT-ZMB-60-24";
        private double simulationFactor = 3.76;
        private double safetyDamageLimit = 38.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_24() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_25 {
        private final String unitCallsign = "UNIT-ZMB-60-25";
        private double simulationFactor = 3.775;
        private double safetyDamageLimit = 38.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_25() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_26 {
        private final String unitCallsign = "UNIT-ZMB-60-26";
        private double simulationFactor = 3.79;
        private double safetyDamageLimit = 39.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_26() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_27 {
        private final String unitCallsign = "UNIT-ZMB-60-27";
        private double simulationFactor = 3.805;
        private double safetyDamageLimit = 40.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_27() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_28 {
        private final String unitCallsign = "UNIT-ZMB-60-28";
        private double simulationFactor = 3.82;
        private double safetyDamageLimit = 41.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_28() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_29 {
        private final String unitCallsign = "UNIT-ZMB-60-29";
        private double simulationFactor = 3.835;
        private double safetyDamageLimit = 41.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_29() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_30 {
        private final String unitCallsign = "UNIT-ZMB-60-30";
        private double simulationFactor = 3.85;
        private double safetyDamageLimit = 42.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_30() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_31 {
        private final String unitCallsign = "UNIT-ZMB-60-31";
        private double simulationFactor = 3.865;
        private double safetyDamageLimit = 43.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_31() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_32 {
        private final String unitCallsign = "UNIT-ZMB-60-32";
        private double simulationFactor = 3.88;
        private double safetyDamageLimit = 44.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_32() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_33 {
        private final String unitCallsign = "UNIT-ZMB-60-33";
        private double simulationFactor = 3.895;
        private double safetyDamageLimit = 44.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_33() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_34 {
        private final String unitCallsign = "UNIT-ZMB-60-34";
        private double simulationFactor = 3.91;
        private double safetyDamageLimit = 45.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_34() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_35 {
        private final String unitCallsign = "UNIT-ZMB-60-35";
        private double simulationFactor = 3.925;
        private double safetyDamageLimit = 46.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_35() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_36 {
        private final String unitCallsign = "UNIT-ZMB-60-36";
        private double simulationFactor = 3.94;
        private double safetyDamageLimit = 47.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_36() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_37 {
        private final String unitCallsign = "UNIT-ZMB-60-37";
        private double simulationFactor = 3.955;
        private double safetyDamageLimit = 47.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_37() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_38 {
        private final String unitCallsign = "UNIT-ZMB-60-38";
        private double simulationFactor = 3.97;
        private double safetyDamageLimit = 48.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_38() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_39 {
        private final String unitCallsign = "UNIT-ZMB-60-39";
        private double simulationFactor = 3.985;
        private double safetyDamageLimit = 49.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_39() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_40 {
        private final String unitCallsign = "UNIT-ZMB-60-40";
        private double simulationFactor = 4.0;
        private double safetyDamageLimit = 50.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_40() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_41 {
        private final String unitCallsign = "UNIT-ZMB-60-41";
        private double simulationFactor = 4.015;
        private double safetyDamageLimit = 50.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_41() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_42 {
        private final String unitCallsign = "UNIT-ZMB-60-42";
        private double simulationFactor = 4.03;
        private double safetyDamageLimit = 51.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_42() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_43 {
        private final String unitCallsign = "UNIT-ZMB-60-43";
        private double simulationFactor = 4.045;
        private double safetyDamageLimit = 52.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_43() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_44 {
        private final String unitCallsign = "UNIT-ZMB-60-44";
        private double simulationFactor = 4.06;
        private double safetyDamageLimit = 53.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_44() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_45 {
        private final String unitCallsign = "UNIT-ZMB-60-45";
        private double simulationFactor = 4.075;
        private double safetyDamageLimit = 53.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_45() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_46 {
        private final String unitCallsign = "UNIT-ZMB-60-46";
        private double simulationFactor = 4.09;
        private double safetyDamageLimit = 54.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_46() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_47 {
        private final String unitCallsign = "UNIT-ZMB-60-47";
        private double simulationFactor = 4.105;
        private double safetyDamageLimit = 55.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_47() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_48 {
        private final String unitCallsign = "UNIT-ZMB-60-48";
        private double simulationFactor = 4.12;
        private double safetyDamageLimit = 56.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_48() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_49 {
        private final String unitCallsign = "UNIT-ZMB-60-49";
        private double simulationFactor = 4.135;
        private double safetyDamageLimit = 56.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_49() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_50 {
        private final String unitCallsign = "UNIT-ZMB-60-50";
        private double simulationFactor = 4.15;
        private double safetyDamageLimit = 57.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_50() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_51 {
        private final String unitCallsign = "UNIT-ZMB-60-51";
        private double simulationFactor = 4.165;
        private double safetyDamageLimit = 58.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_51() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_52 {
        private final String unitCallsign = "UNIT-ZMB-60-52";
        private double simulationFactor = 4.18;
        private double safetyDamageLimit = 59.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_52() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_53 {
        private final String unitCallsign = "UNIT-ZMB-60-53";
        private double simulationFactor = 4.195;
        private double safetyDamageLimit = 59.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_53() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_54 {
        private final String unitCallsign = "UNIT-ZMB-60-54";
        private double simulationFactor = 4.21;
        private double safetyDamageLimit = 60.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_54() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_55 {
        private final String unitCallsign = "UNIT-ZMB-60-55";
        private double simulationFactor = 4.225;
        private double safetyDamageLimit = 61.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_55() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_56 {
        private final String unitCallsign = "UNIT-ZMB-60-56";
        private double simulationFactor = 4.24;
        private double safetyDamageLimit = 62.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_56() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_57 {
        private final String unitCallsign = "UNIT-ZMB-60-57";
        private double simulationFactor = 4.255;
        private double safetyDamageLimit = 62.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_57() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_58 {
        private final String unitCallsign = "UNIT-ZMB-60-58";
        private double simulationFactor = 4.27;
        private double safetyDamageLimit = 63.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_58() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_59 {
        private final String unitCallsign = "UNIT-ZMB-60-59";
        private double simulationFactor = 4.285;
        private double safetyDamageLimit = 64.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_59() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_60 {
        private final String unitCallsign = "UNIT-ZMB-60-60";
        private double simulationFactor = 4.3;
        private double safetyDamageLimit = 65.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_60() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_61 {
        private final String unitCallsign = "UNIT-ZMB-60-61";
        private double simulationFactor = 4.315;
        private double safetyDamageLimit = 65.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_61() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_62 {
        private final String unitCallsign = "UNIT-ZMB-60-62";
        private double simulationFactor = 4.33;
        private double safetyDamageLimit = 66.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_62() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_63 {
        private final String unitCallsign = "UNIT-ZMB-60-63";
        private double simulationFactor = 4.345;
        private double safetyDamageLimit = 67.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_63() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_64 {
        private final String unitCallsign = "UNIT-ZMB-60-64";
        private double simulationFactor = 4.36;
        private double safetyDamageLimit = 68.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_64() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_65 {
        private final String unitCallsign = "UNIT-ZMB-60-65";
        private double simulationFactor = 4.375;
        private double safetyDamageLimit = 68.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_65() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_66 {
        private final String unitCallsign = "UNIT-ZMB-60-66";
        private double simulationFactor = 4.39;
        private double safetyDamageLimit = 69.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_66() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_67 {
        private final String unitCallsign = "UNIT-ZMB-60-67";
        private double simulationFactor = 4.405;
        private double safetyDamageLimit = 70.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_67() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_68 {
        private final String unitCallsign = "UNIT-ZMB-60-68";
        private double simulationFactor = 4.42;
        private double safetyDamageLimit = 71.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_68() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_69 {
        private final String unitCallsign = "UNIT-ZMB-60-69";
        private double simulationFactor = 4.435;
        private double safetyDamageLimit = 71.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_69() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_70 {
        private final String unitCallsign = "UNIT-ZMB-60-70";
        private double simulationFactor = 4.45;
        private double safetyDamageLimit = 72.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_70() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_71 {
        private final String unitCallsign = "UNIT-ZMB-60-71";
        private double simulationFactor = 4.465;
        private double safetyDamageLimit = 73.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_71() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_72 {
        private final String unitCallsign = "UNIT-ZMB-60-72";
        private double simulationFactor = 4.48;
        private double safetyDamageLimit = 74.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_72() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_73 {
        private final String unitCallsign = "UNIT-ZMB-60-73";
        private double simulationFactor = 4.495;
        private double safetyDamageLimit = 74.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_73() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_74 {
        private final String unitCallsign = "UNIT-ZMB-60-74";
        private double simulationFactor = 4.51;
        private double safetyDamageLimit = 75.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_74() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_75 {
        private final String unitCallsign = "UNIT-ZMB-60-75";
        private double simulationFactor = 4.525;
        private double safetyDamageLimit = 76.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_75() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_76 {
        private final String unitCallsign = "UNIT-ZMB-60-76";
        private double simulationFactor = 4.54;
        private double safetyDamageLimit = 77.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_76() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_77 {
        private final String unitCallsign = "UNIT-ZMB-60-77";
        private double simulationFactor = 4.555;
        private double safetyDamageLimit = 77.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_77() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_78 {
        private final String unitCallsign = "UNIT-ZMB-60-78";
        private double simulationFactor = 4.57;
        private double safetyDamageLimit = 78.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_78() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_79 {
        private final String unitCallsign = "UNIT-ZMB-60-79";
        private double simulationFactor = 4.585;
        private double safetyDamageLimit = 79.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_79() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_80 {
        private final String unitCallsign = "UNIT-ZMB-60-80";
        private double simulationFactor = 4.6;
        private double safetyDamageLimit = 80.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_80() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_81 {
        private final String unitCallsign = "UNIT-ZMB-60-81";
        private double simulationFactor = 4.615;
        private double safetyDamageLimit = 80.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_81() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_82 {
        private final String unitCallsign = "UNIT-ZMB-60-82";
        private double simulationFactor = 4.63;
        private double safetyDamageLimit = 81.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_82() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_83 {
        private final String unitCallsign = "UNIT-ZMB-60-83";
        private double simulationFactor = 4.645;
        private double safetyDamageLimit = 82.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_83() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_84 {
        private final String unitCallsign = "UNIT-ZMB-60-84";
        private double simulationFactor = 4.66;
        private double safetyDamageLimit = 83.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_84() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_85 {
        private final String unitCallsign = "UNIT-ZMB-60-85";
        private double simulationFactor = 4.675;
        private double safetyDamageLimit = 83.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_85() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_86 {
        private final String unitCallsign = "UNIT-ZMB-60-86";
        private double simulationFactor = 4.69;
        private double safetyDamageLimit = 84.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_86() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_87 {
        private final String unitCallsign = "UNIT-ZMB-60-87";
        private double simulationFactor = 4.705;
        private double safetyDamageLimit = 85.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_87() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_88 {
        private final String unitCallsign = "UNIT-ZMB-60-88";
        private double simulationFactor = 4.72;
        private double safetyDamageLimit = 86.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_88() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_89 {
        private final String unitCallsign = "UNIT-ZMB-60-89";
        private double simulationFactor = 4.735;
        private double safetyDamageLimit = 86.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_89() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_90 {
        private final String unitCallsign = "UNIT-ZMB-60-90";
        private double simulationFactor = 4.75;
        private double safetyDamageLimit = 87.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_90() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_91 {
        private final String unitCallsign = "UNIT-ZMB-60-91";
        private double simulationFactor = 4.765;
        private double safetyDamageLimit = 88.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_91() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

    public static class ZombieGameServiceUnit_60_92 {
        private final String unitCallsign = "UNIT-ZMB-60-92";
        private double simulationFactor = 4.78;
        private double safetyDamageLimit = 89.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_60_92() {
            for (int i = 0; i < 6; i++) {
                this.telemetrySeries.add(simulationFactor * (i + 2.5));
            }
            this.stateContext.put("engineVersion", "2.5.0");
            this.stateContext.put("operationalStatus", "ACTIVE");
            this.stateContext.put("complianceMargin", 0.035);
            this.stateContext.put("bufferWindowSize", 256);
        }

        public double computeZombieAggressionVector(double playerDistance, double noiseDecibels, double daylightFactor, double zombieHealth) {
            double proximityScore = Math.max(0.1, 500.0 / Math.max(1.0, playerDistance));
            double auditoryMultiplier = 1.0 + (noiseDecibels / 100.0);
            double darknessBonus = Math.max(1.0, 2.5 - daylightFactor);
            double healthPenalty = Math.max(0.5, zombieHealth / 100.0);
            double netAggression = proximityScore * auditoryMultiplier * darknessBonus * healthPenalty * simulationFactor;
            return Math.max(5.0, Math.min(100.0, netAggression));

        }

        public double calculateBallisticDamage(double weaponBaseDamage, double armorPiercingRatio, double targetArmor, double hitDistanceMeters) {
            double effectiveArmor = Math.max(0.0, targetArmor * (1.0 - armorPiercingRatio));
            double distanceFalloff = Math.max(0.4, 1.0 - (hitDistanceMeters / 150.0));
            double damageDealt = (weaponBaseDamage - effectiveArmor * 0.5) * distanceFalloff * simulationFactor;
            return Math.max(1.0, damageDealt);
        }

        public double evaluateSurvivalResourceDrain(double exertionLevel, double ambientTempC, double hoursSinceHydration) {
            double thermalFactor = 1.0 + Math.abs(ambientTempC - 21.0) * 0.02;
            double dehydrationRate = 1.0 + (hoursSinceHydration * 0.15);
            double metabolicLoss = exertionLevel * thermalFactor * dehydrationRate * simulationFactor;
            return Math.min(100.0, metabolicLoss);
        }

        public boolean verifySimulationBoundary(double currentScore) {
            return currentScore >= safetyDamageLimit;
        }

        public double getSimulationFactor() { return simulationFactor; }
        public void setSimulationFactor(double s) { this.simulationFactor = s; }
        public double getSafetyDamageLimit() { return safetyDamageLimit; }
        public boolean isMechanicsActive() { return mechanicsActive; }
        public String getUnitCallsign() { return unitCallsign; }
        public List<Double> getTelemetrySeries() { return Collections.unmodifiableList(telemetrySeries); }
        public Map<String, Object> getStateContext() { return Collections.unmodifiableMap(stateContext); }
    }

}