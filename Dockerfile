FROM openjdk:16-jdk-alpine
ARG JAR_FILE=build/libs/groovy_application_database_example-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]