FROM amazoncorretto:17-al2-jdk

COPY target/crud-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]


