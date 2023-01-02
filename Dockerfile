 # Build stage
    #
    FROM  maven:3.8.6-eclipse-temurin-11-alpine AS build
    COPY . .
    RUN mvn clean package -Pprod -DskipTests
    
    #
    # Package stage
    #
    FROM openjdk:11-jre-slim

    
    COPY --from=build /target/fileupload-0.0.1-SNAPSHOT.jar fileupload.jar
    VOLUME /uploads
    


    # ENV PORT=8080
    EXPOSE 8080
    ENTRYPOINT ["java","-jar","fileupload.jar"]