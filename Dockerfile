FROM openjdk:8
ADD target/tp-boot.jar tp-boot.jar
EXPOSE 9999
ENTRYPOINT ["java","-jar","tp-boot.jar"]