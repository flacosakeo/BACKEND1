FROM amazoncorretto:1.8-alpine-jdk
MAINTAINER emaaristimuno
COPY target/ERL-0.0.1-SNAPSHOT.jar ERL-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/ERL-0.0.1-SNAPSHOT.jar"]