# build stage
FROM maven:3.8.8-amazoncorretto-21-al2023 AS build
WORKDIR /build

COPY . .

RUN mvn clean package -DskipTests

# runtime stage
FROM amazoncorretto:21.0.5
WORKDIR /app

COPY --from=build /build/target/*.jar ./emailService.jar

EXPOSE 8080
EXPOSE 9090

ENV MAIL_USERNAME=''
ENV MAIL_PASSWORD=''

ENTRYPOINT ["java", "-jar", "emailService.jar"]
