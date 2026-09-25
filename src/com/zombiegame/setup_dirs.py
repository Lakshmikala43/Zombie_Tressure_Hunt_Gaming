import os

base_dir = r"C:\Users\WINDOWS\.gemini\antigravity\scratch\zombie-treasure-hunt-java\src\com\zombiegame"

subdirs = [
    "core", "config", "entities/player", "entities/zombies",
    "entities/objects", "entities/projectiles", "world", "ui", "audio", "utils"
]

for sd in subdirs:
    os.makedirs(os.path.join(base_dir, sd), exist_ok=True)

print("Directories created.")
