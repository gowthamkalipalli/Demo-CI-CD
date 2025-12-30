FROM eclipse-temurin:21-jdk
WORKDIR /app
ADD https://storage.googleapis.com/demo-gcp-artifact-bucket/Springboot.jar
EXPOSE 8080
CMD ["java", "-jar", "sp.jar"]
