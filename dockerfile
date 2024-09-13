FROM maven:3.8.1-openjdk-11 AS build

WORKDIR /app

COPY pom.xml /app/
RUN mvn dependency:go-offline

COPY src /app/src
RUN mvn clean package

FROM openjdk:11-jre-slim

WORKDIR /app

COPY --from=build /app/target/RobotSimulator-1.0-SNAPSHOT.jar /app/RobotSimulator.jar

CMD ["java", "-jar", "/app/RobotSimulator.jar"]
