FROM java:8

WORKDIR /apps
ADD ./build/libs/client-0.0.1-SNAPSHOT.jar /apps/client.jar

EXPOSE 8081

CMD ["java", "-jar", "client.jar"]
