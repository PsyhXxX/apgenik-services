FROM eclipse-temurin:17-jdk-alpine

LABEL authors="Arseniy Nikitin"

ARG JAR_FILE=target/apgenik-services-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY docker/run.sh .
COPY ${JAR_FILE} apgenik-services.jar

ENTRYPOINT ["./run.sh"]