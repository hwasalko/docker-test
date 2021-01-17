FROM openjdk:8u275
#COPY target/docker-springboot-*.jar docker-app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","target/docker-springboot-0.0.1-SNAPSHOT.jar"]
