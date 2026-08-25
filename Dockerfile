# Containerized Java 24 Build Environment
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Copy Maven Manifest & Source Code
COPY pom.xml .
COPY src ./src

# Compile Application
RUN javac -d bin -sourcepath src src/com/zombiegame/Main.java

# Execution Stage
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app
COPY --from=build /app/bin ./bin

CMD ["java", "-cp", "bin", "com.zombiegame.Main"]
