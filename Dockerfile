# Use a base image with the necessary Scala environment and Temurin JDK 17
FROM hseeberger/scala-sbt:11.0.12_1.5.5_2.13.6 AS builder

# Set working directory in the container
WORKDIR /app

# Copy the project files to the container
COPY . .

# Build the Scala project using sbt
RUN sbt clean assembly

# Use Temurin JDK 17 as the base image for the final container
FROM openjdk:17-oracle

# Set working directory in the final container
WORKDIR /app

# Copy the built JAR file from the builder stage to the final container
COPY --from=builder /app/target/scala-2.13/DevSecOpsPipeline-assembly-0.1.0-SNAPSHOT.jar .

# Expose the port if your Scala application listens on a specific port
# EXPOSE 8080

# Command to run your Scala application
CMD ["java", "-jar", "DevSecOpsPipeline-assembly-0.1.0-SNAPSHOT.jar"]
