# Use Maven image for building
FROM maven:3.8.6-openjdk-17 AS build

# Set working directory
WORKDIR /app

# Copy pom.xml first for better caching
COPY pom.xml .

# Download dependencies
RUN mvn dependency:go-offline || true

# Copy source code
COPY src ./src

# Build the application
RUN mvn clean package -DskipTests

# Use Eclipse Temurin runtime image
FROM eclipse-temurin:17-jre

# Set working directory
WORKDIR /app

# Copy the jar file from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose port (Render will set PORT env var)
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
