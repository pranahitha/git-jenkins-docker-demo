FROM java:8

ADD target/DemoJarName app.jar

ENTRYPOINT [ "java" , "-jar" , "app.jar" ]
