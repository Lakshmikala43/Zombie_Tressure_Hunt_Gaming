# 🧟 Zombie Treasure Hunt — Enterprise Java Game Codebase

A 2D Horror Zombie Survival Adventure Game built in **Java 24** featuring hardware-accelerated `Graphics2D` rendering, a procedural PCM audio synthesizer, 10 location-based environment biomes, large horror zombie AI scale, a 4-key progression system, and a comprehensive unit test suite (>70,000 Lines of Code).

---

## 📋 Table of Contents

- [Project Overview](#project-overview)
- [Key Features](#key-features)
- [System Architecture & Code Metrics](#system-architecture--code-metrics)
- [Dependencies](#dependencies)
- [Installation & Prerequisites](#installation--prerequisites)
- [Build Instructions](#build-instructions)
- [Running the Application](#running-the-application)
- [Unit Testing & Test Coverage](#unit-testing--test-coverage)
- [Docker Support](#docker-support)
- [Git Workflow & Branching Strategy](#git-workflow--branching-strategy)
- [License](#license)

---

## 🎮 Project Overview

**Zombie Treasure Hunt** combines fast-paced top-down shooter combat with tactical progression mechanics. The player controls a haunted battle-hardened survivor navigating through 10 dangerous levels ranging from abandoned villages to high-security military bases and the Overlord's Island.

---

## 🌟 Key Features

1. **4-Key Progression Loop**:
   - Defeat guardian zombies ➔ Grab physical `🧩 CLUE` map items (<kbd>E</kbd>) ➔ Collect `🔑 1..4` keys ➔ Unlock the `🎁 Treasure Chest` ➔ Earn New Weapons.
2. **10 Location-Based Environment Biomes**:
   - Unique terrain backgrounds, building walls, open 70px `DOOR 🚪` gaps, and atmospheric lighting for every level.
3. **Large Horror Zombie AI & Bosses**:
   - 7 Zombie Types (*Walker, Sprinter, Tank, Spitter, Armored, Mini-Boss, Overlord Boss King*) with custom scale matrix and steering pathfinding.
4. **Military Army Gunshot Audio Synthesizer**:
   - Native procedural PCM audio synthesizer generating supersonic shockwave snaps, gas expansion blasts, 5.56mm kinetic thuds, and mechanical bolt clicks via `javax.sound.sampled`.
5. **Glassmorphism HUD & Minimap**:
   - Real-time inset minimap canvas tracking player, zombies, boss, and treasure chest.

---

## 📊 System Architecture & Code Metrics

- **Language**: Java 24 (`javac 24.0.2`)
- **Total Java Source Files**: 37 Files (`.java`)
- **Total Lines of Code**: **71,089 LOC**
- **Test Suite**: JUnit 5 Unit Tests with JaCoCo Coverage

---

## 📦 Dependencies

| Dependency | Version | Purpose | Manifest |
| :--- | :--- | :--- | :--- |
| **Java JDK** | 24+ | Core Execution Platform | `pom.xml` |
| **JUnit 5 Jupiter** | 5.10.0 | Unit Testing Framework | `pom.xml` |
| **JaCoCo Plugin** | 0.8.10 | Code Test Coverage Reports | `pom.xml` |

---

## ⚙️ Installation & Prerequisites

1. **Java JDK 24 or higher** installed and added to `PATH`.
2. **Apache Maven 3.8+** (optional, for running `mvn test`).
3. **Git 2.40+** (for version control).

---

## 🔨 Build Instructions

### Option 1: Native javac Build
```bash
javac -d bin -sourcepath src (Get-ChildItem -Recurse src -Filter *.java).FullName
```

### Option 2: Makefile
```bash
make build
```

### Option 3: Maven Build
```bash
mvn clean compile
```

---

## 🚀 Running the Application

### Option 1: Double-Click Launcher
Double-click `run_game.bat` inside the project folder.

### Option 2: Command Line
```bash
java -cp bin com.zombiegame.Main
```

---

## 🧪 Unit Testing & Test Coverage

Run the JUnit 5 unit test suite:
```bash
mvn test
```

Generate JaCoCo test coverage report:
```bash
mvn jacoco:report
```

---

## 🐳 Docker Support

Build Docker image:
```bash
docker build -t zombie-treasure-hunt .
```

Run Docker container:
```bash
docker run -it --rm zombie-treasure-hunt
```

---

## 🔀 Git Workflow & Branching Strategy

The project adheres to a Git-flow branching model featuring:
- Feature branches (`feature/core-engine`, `feature/entities-weapons`, `feature/zombies-boss-ai`, `feature/world-audio-ui`).
- Explicit non-fast-forward merge commits (`git merge --no-ff`).
- Structured commit messages (`feat:`, `test:`, `docs:`).

---

## 📄 License

Proprietary and Confidential. Copyright (c) 2026 ZombieGame Dev Team. All Rights Reserved.
