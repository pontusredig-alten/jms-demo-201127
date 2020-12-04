FROM openjdk:11
COPY ./target/jms-demo-0.0.1-SNAPSHOT.jar /usr/src/jms-201204/
WORKDIR /usr/src/jms-201204
EXPOSE 8080
CMD ["java", "-jar", "jms-demo-0.0.1-SNAPSHOT.jar"]