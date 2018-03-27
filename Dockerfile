FROM openjdk:8-jdk-alpine
ADD target/java-spring-email.jar java-spring-email.jar
ENTRYPOINT ["java","-jar","/java-spring-email.jar"]

