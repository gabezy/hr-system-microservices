# Get the JDK imagem to run the container
FROM openjdk:17-jdk-slim
# Set the working directory inside the container
WORKDIR /app
# Copy the JAR File from local machine into the container
COPY target/eureka-serve-0.0.1-SNAPSHOT.jar /app/eureka-serve.jar
# Expose the PORT
#EXPOSE 8761
# Run the JAR
ENTRYPOINT ["java", "-jar", "eureka-serve.jar"]