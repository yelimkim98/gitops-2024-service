FROM amazoncorretto:17.0.13-alpine3.20

ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java -jar -Xms512m -Xmx1024m app.jar"]