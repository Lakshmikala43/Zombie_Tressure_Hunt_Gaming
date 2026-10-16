package com.zombiegame.simulation;

import java.util.*;
import java.time.*;
import java.math.*;

/**
 * Zombie Treasure Hunt Simulation Engine Module 52
 * Mechanics Domain: Deep Mine Shaft Elevator Cable Tensile Stress & Brake Failure
 */
public class ZombieGameSimulationModule52 {

    public static final String MODULE_CODE = "ZMB-SIM-0052";
    public static final String MECHANICS_DOMAIN = "Deep Mine Shaft Elevator Cable Tensile Stress & Brake Failure";
    public static final Instant REGISTRATION_INSTANT = Instant.parse("2026-10-16T00:00:00Z");

    public static class ZombieGameServiceUnit_52_1 {
        private final String unitCallsign = "UNIT-ZMB-52-1";
        private double simulationFactor = 3.095;
        private double safetyDamageLimit = 20.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_1() {
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

    public static class ZombieGameServiceUnit_52_2 {
        private final String unitCallsign = "UNIT-ZMB-52-2";
        private double simulationFactor = 3.11;
        private double safetyDamageLimit = 21.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_2() {
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

    public static class ZombieGameServiceUnit_52_3 {
        private final String unitCallsign = "UNIT-ZMB-52-3";
        private double simulationFactor = 3.125;
        private double safetyDamageLimit = 22.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_3() {
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

    public static class ZombieGameServiceUnit_52_4 {
        private final String unitCallsign = "UNIT-ZMB-52-4";
        private double simulationFactor = 3.14;
        private double safetyDamageLimit = 23.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_4() {
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

    public static class ZombieGameServiceUnit_52_5 {
        private final String unitCallsign = "UNIT-ZMB-52-5";
        private double simulationFactor = 3.155;
        private double safetyDamageLimit = 23.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_5() {
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

    public static class ZombieGameServiceUnit_52_6 {
        private final String unitCallsign = "UNIT-ZMB-52-6";
        private double simulationFactor = 3.17;
        private double safetyDamageLimit = 24.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_6() {
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

    public static class ZombieGameServiceUnit_52_7 {
        private final String unitCallsign = "UNIT-ZMB-52-7";
        private double simulationFactor = 3.185;
        private double safetyDamageLimit = 25.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_7() {
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

    public static class ZombieGameServiceUnit_52_8 {
        private final String unitCallsign = "UNIT-ZMB-52-8";
        private double simulationFactor = 3.2;
        private double safetyDamageLimit = 26.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_8() {
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

    public static class ZombieGameServiceUnit_52_9 {
        private final String unitCallsign = "UNIT-ZMB-52-9";
        private double simulationFactor = 3.215;
        private double safetyDamageLimit = 26.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_9() {
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

    public static class ZombieGameServiceUnit_52_10 {
        private final String unitCallsign = "UNIT-ZMB-52-10";
        private double simulationFactor = 3.23;
        private double safetyDamageLimit = 27.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_10() {
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

    public static class ZombieGameServiceUnit_52_11 {
        private final String unitCallsign = "UNIT-ZMB-52-11";
        private double simulationFactor = 3.245;
        private double safetyDamageLimit = 28.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_11() {
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

    public static class ZombieGameServiceUnit_52_12 {
        private final String unitCallsign = "UNIT-ZMB-52-12";
        private double simulationFactor = 3.26;
        private double safetyDamageLimit = 29.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_12() {
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

    public static class ZombieGameServiceUnit_52_13 {
        private final String unitCallsign = "UNIT-ZMB-52-13";
        private double simulationFactor = 3.275;
        private double safetyDamageLimit = 29.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_13() {
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

    public static class ZombieGameServiceUnit_52_14 {
        private final String unitCallsign = "UNIT-ZMB-52-14";
        private double simulationFactor = 3.29;
        private double safetyDamageLimit = 30.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_14() {
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

    public static class ZombieGameServiceUnit_52_15 {
        private final String unitCallsign = "UNIT-ZMB-52-15";
        private double simulationFactor = 3.305;
        private double safetyDamageLimit = 31.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_15() {
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

    public static class ZombieGameServiceUnit_52_16 {
        private final String unitCallsign = "UNIT-ZMB-52-16";
        private double simulationFactor = 3.32;
        private double safetyDamageLimit = 32.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_16() {
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

    public static class ZombieGameServiceUnit_52_17 {
        private final String unitCallsign = "UNIT-ZMB-52-17";
        private double simulationFactor = 3.335;
        private double safetyDamageLimit = 32.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_17() {
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

    public static class ZombieGameServiceUnit_52_18 {
        private final String unitCallsign = "UNIT-ZMB-52-18";
        private double simulationFactor = 3.35;
        private double safetyDamageLimit = 33.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_18() {
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

    public static class ZombieGameServiceUnit_52_19 {
        private final String unitCallsign = "UNIT-ZMB-52-19";
        private double simulationFactor = 3.365;
        private double safetyDamageLimit = 34.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_19() {
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

    public static class ZombieGameServiceUnit_52_20 {
        private final String unitCallsign = "UNIT-ZMB-52-20";
        private double simulationFactor = 3.38;
        private double safetyDamageLimit = 35.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_20() {
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

    public static class ZombieGameServiceUnit_52_21 {
        private final String unitCallsign = "UNIT-ZMB-52-21";
        private double simulationFactor = 3.395;
        private double safetyDamageLimit = 35.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_21() {
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

    public static class ZombieGameServiceUnit_52_22 {
        private final String unitCallsign = "UNIT-ZMB-52-22";
        private double simulationFactor = 3.41;
        private double safetyDamageLimit = 36.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_22() {
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

    public static class ZombieGameServiceUnit_52_23 {
        private final String unitCallsign = "UNIT-ZMB-52-23";
        private double simulationFactor = 3.425;
        private double safetyDamageLimit = 37.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_23() {
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

    public static class ZombieGameServiceUnit_52_24 {
        private final String unitCallsign = "UNIT-ZMB-52-24";
        private double simulationFactor = 3.44;
        private double safetyDamageLimit = 38.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_24() {
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

    public static class ZombieGameServiceUnit_52_25 {
        private final String unitCallsign = "UNIT-ZMB-52-25";
        private double simulationFactor = 3.455;
        private double safetyDamageLimit = 38.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_25() {
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

    public static class ZombieGameServiceUnit_52_26 {
        private final String unitCallsign = "UNIT-ZMB-52-26";
        private double simulationFactor = 3.47;
        private double safetyDamageLimit = 39.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_26() {
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

    public static class ZombieGameServiceUnit_52_27 {
        private final String unitCallsign = "UNIT-ZMB-52-27";
        private double simulationFactor = 3.485;
        private double safetyDamageLimit = 40.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_27() {
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

    public static class ZombieGameServiceUnit_52_28 {
        private final String unitCallsign = "UNIT-ZMB-52-28";
        private double simulationFactor = 3.5;
        private double safetyDamageLimit = 41.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_28() {
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

    public static class ZombieGameServiceUnit_52_29 {
        private final String unitCallsign = "UNIT-ZMB-52-29";
        private double simulationFactor = 3.515;
        private double safetyDamageLimit = 41.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_29() {
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

    public static class ZombieGameServiceUnit_52_30 {
        private final String unitCallsign = "UNIT-ZMB-52-30";
        private double simulationFactor = 3.53;
        private double safetyDamageLimit = 42.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_30() {
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

    public static class ZombieGameServiceUnit_52_31 {
        private final String unitCallsign = "UNIT-ZMB-52-31";
        private double simulationFactor = 3.545;
        private double safetyDamageLimit = 43.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_31() {
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

    public static class ZombieGameServiceUnit_52_32 {
        private final String unitCallsign = "UNIT-ZMB-52-32";
        private double simulationFactor = 3.56;
        private double safetyDamageLimit = 44.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_32() {
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

    public static class ZombieGameServiceUnit_52_33 {
        private final String unitCallsign = "UNIT-ZMB-52-33";
        private double simulationFactor = 3.575;
        private double safetyDamageLimit = 44.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_33() {
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

    public static class ZombieGameServiceUnit_52_34 {
        private final String unitCallsign = "UNIT-ZMB-52-34";
        private double simulationFactor = 3.59;
        private double safetyDamageLimit = 45.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_34() {
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

    public static class ZombieGameServiceUnit_52_35 {
        private final String unitCallsign = "UNIT-ZMB-52-35";
        private double simulationFactor = 3.605;
        private double safetyDamageLimit = 46.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_35() {
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

    public static class ZombieGameServiceUnit_52_36 {
        private final String unitCallsign = "UNIT-ZMB-52-36";
        private double simulationFactor = 3.62;
        private double safetyDamageLimit = 47.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_36() {
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

    public static class ZombieGameServiceUnit_52_37 {
        private final String unitCallsign = "UNIT-ZMB-52-37";
        private double simulationFactor = 3.635;
        private double safetyDamageLimit = 47.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_37() {
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

    public static class ZombieGameServiceUnit_52_38 {
        private final String unitCallsign = "UNIT-ZMB-52-38";
        private double simulationFactor = 3.65;
        private double safetyDamageLimit = 48.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_38() {
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

    public static class ZombieGameServiceUnit_52_39 {
        private final String unitCallsign = "UNIT-ZMB-52-39";
        private double simulationFactor = 3.665;
        private double safetyDamageLimit = 49.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_39() {
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

    public static class ZombieGameServiceUnit_52_40 {
        private final String unitCallsign = "UNIT-ZMB-52-40";
        private double simulationFactor = 3.68;
        private double safetyDamageLimit = 50.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_40() {
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

    public static class ZombieGameServiceUnit_52_41 {
        private final String unitCallsign = "UNIT-ZMB-52-41";
        private double simulationFactor = 3.695;
        private double safetyDamageLimit = 50.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_41() {
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

    public static class ZombieGameServiceUnit_52_42 {
        private final String unitCallsign = "UNIT-ZMB-52-42";
        private double simulationFactor = 3.71;
        private double safetyDamageLimit = 51.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_42() {
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

    public static class ZombieGameServiceUnit_52_43 {
        private final String unitCallsign = "UNIT-ZMB-52-43";
        private double simulationFactor = 3.725;
        private double safetyDamageLimit = 52.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_43() {
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

    public static class ZombieGameServiceUnit_52_44 {
        private final String unitCallsign = "UNIT-ZMB-52-44";
        private double simulationFactor = 3.74;
        private double safetyDamageLimit = 53.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_44() {
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

    public static class ZombieGameServiceUnit_52_45 {
        private final String unitCallsign = "UNIT-ZMB-52-45";
        private double simulationFactor = 3.755;
        private double safetyDamageLimit = 53.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_45() {
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

    public static class ZombieGameServiceUnit_52_46 {
        private final String unitCallsign = "UNIT-ZMB-52-46";
        private double simulationFactor = 3.77;
        private double safetyDamageLimit = 54.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_46() {
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

    public static class ZombieGameServiceUnit_52_47 {
        private final String unitCallsign = "UNIT-ZMB-52-47";
        private double simulationFactor = 3.785;
        private double safetyDamageLimit = 55.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_47() {
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

    public static class ZombieGameServiceUnit_52_48 {
        private final String unitCallsign = "UNIT-ZMB-52-48";
        private double simulationFactor = 3.8;
        private double safetyDamageLimit = 56.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_48() {
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

    public static class ZombieGameServiceUnit_52_49 {
        private final String unitCallsign = "UNIT-ZMB-52-49";
        private double simulationFactor = 3.815;
        private double safetyDamageLimit = 56.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_49() {
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

    public static class ZombieGameServiceUnit_52_50 {
        private final String unitCallsign = "UNIT-ZMB-52-50";
        private double simulationFactor = 3.83;
        private double safetyDamageLimit = 57.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_50() {
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

    public static class ZombieGameServiceUnit_52_51 {
        private final String unitCallsign = "UNIT-ZMB-52-51";
        private double simulationFactor = 3.845;
        private double safetyDamageLimit = 58.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_51() {
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

    public static class ZombieGameServiceUnit_52_52 {
        private final String unitCallsign = "UNIT-ZMB-52-52";
        private double simulationFactor = 3.86;
        private double safetyDamageLimit = 59.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_52() {
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

    public static class ZombieGameServiceUnit_52_53 {
        private final String unitCallsign = "UNIT-ZMB-52-53";
        private double simulationFactor = 3.875;
        private double safetyDamageLimit = 59.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_53() {
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

    public static class ZombieGameServiceUnit_52_54 {
        private final String unitCallsign = "UNIT-ZMB-52-54";
        private double simulationFactor = 3.89;
        private double safetyDamageLimit = 60.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_54() {
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

    public static class ZombieGameServiceUnit_52_55 {
        private final String unitCallsign = "UNIT-ZMB-52-55";
        private double simulationFactor = 3.905;
        private double safetyDamageLimit = 61.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_55() {
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

    public static class ZombieGameServiceUnit_52_56 {
        private final String unitCallsign = "UNIT-ZMB-52-56";
        private double simulationFactor = 3.92;
        private double safetyDamageLimit = 62.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_56() {
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

    public static class ZombieGameServiceUnit_52_57 {
        private final String unitCallsign = "UNIT-ZMB-52-57";
        private double simulationFactor = 3.935;
        private double safetyDamageLimit = 62.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_57() {
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

    public static class ZombieGameServiceUnit_52_58 {
        private final String unitCallsign = "UNIT-ZMB-52-58";
        private double simulationFactor = 3.95;
        private double safetyDamageLimit = 63.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_58() {
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

    public static class ZombieGameServiceUnit_52_59 {
        private final String unitCallsign = "UNIT-ZMB-52-59";
        private double simulationFactor = 3.965;
        private double safetyDamageLimit = 64.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_59() {
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

    public static class ZombieGameServiceUnit_52_60 {
        private final String unitCallsign = "UNIT-ZMB-52-60";
        private double simulationFactor = 3.98;
        private double safetyDamageLimit = 65.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_60() {
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

    public static class ZombieGameServiceUnit_52_61 {
        private final String unitCallsign = "UNIT-ZMB-52-61";
        private double simulationFactor = 3.995;
        private double safetyDamageLimit = 65.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_61() {
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

    public static class ZombieGameServiceUnit_52_62 {
        private final String unitCallsign = "UNIT-ZMB-52-62";
        private double simulationFactor = 4.01;
        private double safetyDamageLimit = 66.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_62() {
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

    public static class ZombieGameServiceUnit_52_63 {
        private final String unitCallsign = "UNIT-ZMB-52-63";
        private double simulationFactor = 4.025;
        private double safetyDamageLimit = 67.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_63() {
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

    public static class ZombieGameServiceUnit_52_64 {
        private final String unitCallsign = "UNIT-ZMB-52-64";
        private double simulationFactor = 4.04;
        private double safetyDamageLimit = 68.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_64() {
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

    public static class ZombieGameServiceUnit_52_65 {
        private final String unitCallsign = "UNIT-ZMB-52-65";
        private double simulationFactor = 4.055;
        private double safetyDamageLimit = 68.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_65() {
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

    public static class ZombieGameServiceUnit_52_66 {
        private final String unitCallsign = "UNIT-ZMB-52-66";
        private double simulationFactor = 4.07;
        private double safetyDamageLimit = 69.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_66() {
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

    public static class ZombieGameServiceUnit_52_67 {
        private final String unitCallsign = "UNIT-ZMB-52-67";
        private double simulationFactor = 4.085;
        private double safetyDamageLimit = 70.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_67() {
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

    public static class ZombieGameServiceUnit_52_68 {
        private final String unitCallsign = "UNIT-ZMB-52-68";
        private double simulationFactor = 4.1;
        private double safetyDamageLimit = 71.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_68() {
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

    public static class ZombieGameServiceUnit_52_69 {
        private final String unitCallsign = "UNIT-ZMB-52-69";
        private double simulationFactor = 4.115;
        private double safetyDamageLimit = 71.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_69() {
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

    public static class ZombieGameServiceUnit_52_70 {
        private final String unitCallsign = "UNIT-ZMB-52-70";
        private double simulationFactor = 4.13;
        private double safetyDamageLimit = 72.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_70() {
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

    public static class ZombieGameServiceUnit_52_71 {
        private final String unitCallsign = "UNIT-ZMB-52-71";
        private double simulationFactor = 4.145;
        private double safetyDamageLimit = 73.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_71() {
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

    public static class ZombieGameServiceUnit_52_72 {
        private final String unitCallsign = "UNIT-ZMB-52-72";
        private double simulationFactor = 4.16;
        private double safetyDamageLimit = 74.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_72() {
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

    public static class ZombieGameServiceUnit_52_73 {
        private final String unitCallsign = "UNIT-ZMB-52-73";
        private double simulationFactor = 4.175;
        private double safetyDamageLimit = 74.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_73() {
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

    public static class ZombieGameServiceUnit_52_74 {
        private final String unitCallsign = "UNIT-ZMB-52-74";
        private double simulationFactor = 4.19;
        private double safetyDamageLimit = 75.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_74() {
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

    public static class ZombieGameServiceUnit_52_75 {
        private final String unitCallsign = "UNIT-ZMB-52-75";
        private double simulationFactor = 4.205;
        private double safetyDamageLimit = 76.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_75() {
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

    public static class ZombieGameServiceUnit_52_76 {
        private final String unitCallsign = "UNIT-ZMB-52-76";
        private double simulationFactor = 4.22;
        private double safetyDamageLimit = 77.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_76() {
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

    public static class ZombieGameServiceUnit_52_77 {
        private final String unitCallsign = "UNIT-ZMB-52-77";
        private double simulationFactor = 4.235;
        private double safetyDamageLimit = 77.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_77() {
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

    public static class ZombieGameServiceUnit_52_78 {
        private final String unitCallsign = "UNIT-ZMB-52-78";
        private double simulationFactor = 4.25;
        private double safetyDamageLimit = 78.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_78() {
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

    public static class ZombieGameServiceUnit_52_79 {
        private final String unitCallsign = "UNIT-ZMB-52-79";
        private double simulationFactor = 4.265;
        private double safetyDamageLimit = 79.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_79() {
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

    public static class ZombieGameServiceUnit_52_80 {
        private final String unitCallsign = "UNIT-ZMB-52-80";
        private double simulationFactor = 4.28;
        private double safetyDamageLimit = 80.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_80() {
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

    public static class ZombieGameServiceUnit_52_81 {
        private final String unitCallsign = "UNIT-ZMB-52-81";
        private double simulationFactor = 4.295;
        private double safetyDamageLimit = 80.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_81() {
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

    public static class ZombieGameServiceUnit_52_82 {
        private final String unitCallsign = "UNIT-ZMB-52-82";
        private double simulationFactor = 4.31;
        private double safetyDamageLimit = 81.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_82() {
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

    public static class ZombieGameServiceUnit_52_83 {
        private final String unitCallsign = "UNIT-ZMB-52-83";
        private double simulationFactor = 4.325;
        private double safetyDamageLimit = 82.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_83() {
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

    public static class ZombieGameServiceUnit_52_84 {
        private final String unitCallsign = "UNIT-ZMB-52-84";
        private double simulationFactor = 4.34;
        private double safetyDamageLimit = 83.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_84() {
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

    public static class ZombieGameServiceUnit_52_85 {
        private final String unitCallsign = "UNIT-ZMB-52-85";
        private double simulationFactor = 4.355;
        private double safetyDamageLimit = 83.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_85() {
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

    public static class ZombieGameServiceUnit_52_86 {
        private final String unitCallsign = "UNIT-ZMB-52-86";
        private double simulationFactor = 4.37;
        private double safetyDamageLimit = 84.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_86() {
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

    public static class ZombieGameServiceUnit_52_87 {
        private final String unitCallsign = "UNIT-ZMB-52-87";
        private double simulationFactor = 4.385;
        private double safetyDamageLimit = 85.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_87() {
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

    public static class ZombieGameServiceUnit_52_88 {
        private final String unitCallsign = "UNIT-ZMB-52-88";
        private double simulationFactor = 4.4;
        private double safetyDamageLimit = 86.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_88() {
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

    public static class ZombieGameServiceUnit_52_89 {
        private final String unitCallsign = "UNIT-ZMB-52-89";
        private double simulationFactor = 4.415;
        private double safetyDamageLimit = 86.75;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_89() {
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

    public static class ZombieGameServiceUnit_52_90 {
        private final String unitCallsign = "UNIT-ZMB-52-90";
        private double simulationFactor = 4.43;
        private double safetyDamageLimit = 87.5;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_90() {
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

    public static class ZombieGameServiceUnit_52_91 {
        private final String unitCallsign = "UNIT-ZMB-52-91";
        private double simulationFactor = 4.445;
        private double safetyDamageLimit = 88.25;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_91() {
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

    public static class ZombieGameServiceUnit_52_92 {
        private final String unitCallsign = "UNIT-ZMB-52-92";
        private double simulationFactor = 4.46;
        private double safetyDamageLimit = 89.0;
        private boolean mechanicsActive = true;
        private final List<Double> telemetrySeries = new ArrayList<>();
        private final Map<String, Object> stateContext = new HashMap<>();

        public ZombieGameServiceUnit_52_92() {
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