FROM maven:3.8.1-openjdk-11 AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:11.0.11-jre

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/application-test-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "application-test-0.0.1-SNAPSHOT.jar"]
