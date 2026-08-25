.PHONY: all build run test clean

all: build

build:
	@echo "Building Zombie Treasure Hunt (Java 24)..."
	javac -d bin -sourcepath src src/com/zombiegame/Main.java

run: build
	@echo "Launching Zombie Treasure Hunt..."
	java -cp bin com.zombiegame.Main

test:
	@echo "Running JUnit 5 Unit Test Suite..."
	mvn test

clean:
	@echo "Cleaning compiled output..."
	rm -rf bin/ target/
