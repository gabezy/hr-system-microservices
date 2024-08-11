## HR System

The HR System is a system simulated as a Human resource that implements the microservice architecture using Spring components to create the Web services, such as the user API that handles the retrieving employee information (username, hourly price) and the payroll API that handles the payments and salary. This project was created by imagining a scenario where the services can be easily instantiated multiple times, ensuring flexibility, scalability and availability.

## 🔮 Technologies

- **[Java 17](https://www.oracle.com/java)**
- **[Spring Boot 3](https://spring.io/projects/spring-boot)**
- **[Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)**
- **[Eureka Service Registry](https://spring.io/guides/gs/service-registration-and-discovery)**
- **[Docker](https://www.docker.com/)**
- **[Maven](https://maven.apache.org)**
- **[H2 database](https://maven.apache.org)**

## Run

```bash
docker compose up
```

After all the service's containers run (eureka-server, user-api, payroll-api and api-gateway), is possible to make a request to the gateway at port 8765, by default.

```bash 
curl -H "Accept: application/json" http://localhost:8765/api/users # GET all users
curl -H "Accept: application/json" http://localhost:8765/api/users/{id} # GET specific user
curl -X POST -H "Content-Type: application/json" -d '{"userId": 2, "description": "January 2024 payment", "workingHours": 100.0}' http://localhost:8765/api/payments  # POST a payment that calculates the salary based on a given "workingHours"
```

