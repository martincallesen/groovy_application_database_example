FROM adoptopenjdk:16-jre-hotspot
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]