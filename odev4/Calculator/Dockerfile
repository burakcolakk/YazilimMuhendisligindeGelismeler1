FROM openjdk:17-jdk-slim

ARG JAR_FILE=target/Calculator-0.0.1-SNAPSHOT.jar

COPY ${JAR_FILE} app.jar

EXPOSE 44

ENTRYPOINT ["java", "-jar", "/app.jar"]