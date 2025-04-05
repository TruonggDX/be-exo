FROM openjdk:17-jdk-alpine as build
WORKDIR /app
COPY . .
RUN ./gradlew build --no-daemon
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=build /app/build/libs/registry-0.0.1-SNAPSHOT.jar /app/registry-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/app/registry-0.0.1-SNAPSHOT.jar", "--debug"]