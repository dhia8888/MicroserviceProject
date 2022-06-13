FROM  openjdk:8
EXPOSE 8054
ADD /target/apigw-1.0-SNAPSHOT api-gateway.jar
ENTRYPOINT ["java", "-jar", "api-gateway.jar"]