#lightweight runtime image als basis
FROM eclipse-temurin:21-jre-jammy

WORKDIR /app

# copy from maven build to image
COPY target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]