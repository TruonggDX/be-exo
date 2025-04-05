FROM openjdk:17-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/gateway-service-0.0.1-SNAPSHOT.jar /app/gateway-service-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/gateway-service-0.0.1-SNAPSHOT.jar", "--debug"]