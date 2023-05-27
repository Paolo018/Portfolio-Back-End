FROM amazoncorretto:20-jdk

COPY target/pablo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]