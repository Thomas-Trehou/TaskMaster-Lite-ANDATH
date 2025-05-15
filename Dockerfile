FROM eclipse-temurin:21-jre-jammy
WORKDIR /app
COPY target/TaskMasterLite-1.0-SNAPSHOT.jar taskmasterlite.jar
ENTRYPOINT ["java", "-jar", "taskmasterlite.jar"]