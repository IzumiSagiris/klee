FROM fabric8/java-centos-openjdk8-jdk
MAINTAINER arcana
COPY klee-0.0.1-SNAPSHOT.jar /home/klee-0.0.1-SNAPSHOT.jar
EXPOSE 7071
ENTRYPOINT ["java", "-jar", "/home/klee-0.0.1-SNAPSHOT.jar"]
