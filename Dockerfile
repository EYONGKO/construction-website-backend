# Use Maven image for building
FROM maven:3.9-openjdk-21 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml first for better caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use OpenJDK runtime image
FROM openjdk:21-jre-slim

# Set working directory
WORKDIR /app

# Copy the jar file from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port
EXPOSE 8080

# Add health check endpoint
RUN mkdir -p /app/actuator/health && echo "OK" > /app/actuator/health

# Run the application
CMD ["java", "-jar", "app.jar"]
