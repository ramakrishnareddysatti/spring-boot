FROM openjdk:8-jdk-alpine as build
WORKDIR /workspace/app

RUN apk update && apk add dos2unix
COPY mvnw .
RUN dos2unix mvnw && chmod +x mvnw

COPY .mvn .mvn
COPY pom.xml .
COPY src src

RUN ./mvnw install -DskipTests
RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

FROM openjdk:8-jdk-alpine
RUN addgroup -S demo && adduser -S demo -G demo
USER demo
VOLUME /tmp
ARG DEPENDENCY=/workspace/app/target/dependency
COPY --from=build ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=build ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=build ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","com.example.springboot.ConsoleApp"]

#ENTRYPOINT [ "sh", "-cp", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app:app/lib/*", "com.example.springboot.Application" ]
#ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar" ]