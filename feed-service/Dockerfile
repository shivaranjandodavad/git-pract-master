FROM openjdk:11
ADD ./target/feed-service-0.0.1-SNAPSHOT.jar /usr/src/feed-service-0.0.1-SNAPSHOT.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar","feed-service-0.0.1-SNAPSHOT.jar"]