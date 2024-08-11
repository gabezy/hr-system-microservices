FROM openjdk:17-slim
WORKDIR /app
# Copy the build JAR to workdir
COPY /target/payroll-api-0.0.1-SNAPSHOT.jar /app/payroll-api.jar
# Run the command java -jar app.jar
ENTRYPOINT ["java", "-jar", "payroll-api.jar"]