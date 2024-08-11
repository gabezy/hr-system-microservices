FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/user-api-0.0.1-SNAPSHOT.jar /app/user-api.jar
ENTRYPOINT ["java", "-jar", "user-api.jar"]
