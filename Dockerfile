FROM openjdk:8-jdk-alpine

EXPOSE 8000-8999

COPY "target/directory-0.0.1-SNAPSHOT.jar" /app/directory.jar

CMD ["java", "-jar", "/app/directory.jar"]