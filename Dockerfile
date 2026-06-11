# Step 1: Use an official, lightweight Java 21 runtime image
FROM eclipse-temurin:21-jre-jammy

# Step 2: Set the working directory inside the container
WORKDIR /app

# Step 3: Copy the compiled jar file from the Maven build into the container
COPY target/*.jar app.jar

# Step 4: Expose port 8080 (or 8081 if you changed it)
EXPOSE 8080

# Step 5: Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]