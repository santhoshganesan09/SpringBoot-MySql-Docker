FROM openjdk:22-jdk

ADD target/studentDocker.jar studentDocker.jar

ENTRYPOINT ["java", "-jar", "/studentDocker.jar"]
