FROM openjdk:17-alpine
WORKDIR /opt
COPY target/*.jar /opt/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]