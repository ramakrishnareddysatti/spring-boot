FROM openjdk:8-jdk-alpine as build
RUN addgroup -S demo && adduser -S demo -G demo
USER demo
WORKDIR /workspace/app
VOLUME /tmp
ADD target/*.jar /workspace/app/app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]