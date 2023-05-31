FROM adoptopenjdk/openjdk13-openj9:latest
MAINTAINER ece.upatras.gr
COPY deploy/ask3-0.0.1-SNAPSHOT-exec.jar /opt/ask3/
WORKDIR /opt/ask3/
CMD ["java", "-jar", "/opt/ask3/ask3-0.0.1-SNAPSHOT-exec.jar"]
EXPOSE 8888