FROM amazoncorretto:8-alpine-jdk

MAINTAINER emaaristimuno

COPY C:/Users/flaco/OneDrive/Escritorio/curso/ProyectoFinal/BackEnd/src/main/java/com/portfolio/ERL/ErlApplication.jar C:/Users/flaco/OneDrive/Escritorio/curso/ProyectoFinal/BackEnd/src/main/java/com/portfolio/ERL/ErlApplication.jar

ENTRYPOINT ["java","-jar","C:/Users/flaco/OneDrive/Escritorio/curso/ProyectoFinal/BackEnd/src/main/java/com/portfolio/ERL/ErlApplication.jar"]