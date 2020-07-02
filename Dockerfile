FROM openjdk:8
WORKDIR /app
CMD java -jar app.jar
EXPOSE 8081
COPY  ./target/*.jar app.jar



