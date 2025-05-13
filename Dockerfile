FROM openjdk:17
COPY target/springboot-docker-app.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "springboot-docker-app.jar"]
