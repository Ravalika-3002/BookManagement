# Stage 1: Build the application and resolve dependencies
FROM maven:3.9.4-eclipse-temurin-21-alpine AS build
WORKDIR /app

COPY pom.xml .
COPY src ./src

# Download dependencies to cache them
RUN mvn dependency:copy-dependencies

# Package the application as a fat jar or standard jar
RUN mvn -X package -DskipTests

# Stage 2: Create the final image
FROM eclipse-temurin:21-alpine
WORKDIR /app

# Copy final JAR (rename output to bookmanagement.jar)
COPY --from=build /app/target/*.jar bookmanagement.jar

# Application is running on port 8100
EXPOSE 8100

# Run the application
ENTRYPOINT ["java", "-jar", "bookmanagement.jar"]
