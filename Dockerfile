FROM openjdk:8-jdk

VOL ../../
ADD ./target/NewsSpring-0.0.1-SNAPSHOT.jar newsapimongo.jar
RUN sh -c 'touch /newsapimongo.jar'
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.data.mongodb.uri=mongodb://mongo-db/users","-Djava.security.egd=file:/dev/./urandom","-jar","/newsapimongo.jar"]
