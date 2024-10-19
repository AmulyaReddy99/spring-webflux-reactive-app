FROM openjdk:17-jdk-slim
COPY build/libs/spring-webflux-reactive-rest-api-demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8099