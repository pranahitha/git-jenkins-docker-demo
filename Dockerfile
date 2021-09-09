FROM java:8

ADD target/git-jenkins-docker-demo-0.0.1-SNAPSHOT app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]

EXPOSE 8080