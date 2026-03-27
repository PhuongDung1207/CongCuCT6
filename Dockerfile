FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN sed -i 's/\r$//' mvnw && chmod +x mvnw
COPY src/ src/
RUN ./mvnw -q -DskipTests package

FROM eclipse-temurin:21-jre-alpine

WORKDIR /app
COPY --from=build /app/target/demo-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
