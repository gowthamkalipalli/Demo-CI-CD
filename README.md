# Spring Boot GKE Deployment Demo

A complete Spring Boot application with Docker and Kubernetes manifests for deployment on Google Kubernetes Engine (GKE).

## Features
- Spring Boot 3.1.5 with Java 17
- REST API endpoints
- Health checks and metrics
- Swagger/OpenAPI documentation
- Docker containerization
- Kubernetes deployment manifests
- Horizontal Pod Autoscaling (HPA)
- GKE Ingress configuration

## API Endpoints
- `GET /api/health` - Health check endpoint
- `GET /api/greet/{name}` - Greeting endpoint
- `GET /api/info` - Application info
- `POST /api/echo` - Echo endpoint
- `GET /actuator/health` - Spring Boot Actuator health
- `GET /actuator/prometheus` - Prometheus metrics
- `GET /swagger-ui.html` - Swagger UI
- `GET /api-docs` - OpenAPI documentation

## Prerequisites
- Java 17+
- Maven 3.6+
- Docker 20.10+
- kubectl
- gcloud CLI
- Access to GKE cluster

## Local Development

### 1. Build and Run Locally
```bash
# Build the application
mvn clean package

# Run the application
java -jar target/springboot-gke-demo-1.0.0.jar
