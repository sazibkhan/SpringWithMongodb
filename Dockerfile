FROM openjdk:11
EXPOSE 8095
ADD target/SpringWithMongodb.jsr SpringWithMongodb.jar
ENTRYPOINT["java","jar","/SpringWithMongodb.jar"]