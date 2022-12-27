FROM amazoncorretto:11-alpine-jdk
MAINTAINER emaaristimuno
COPY src/main/java/com/portfolio/ERL/ErlApplication.jar ErlApplication.jar
ENTRYPOINT ["java","-jar","/ErlApplication.jar"]