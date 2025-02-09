FROM openjdk:17
COPY target/SB_Jenkin_docker.jar /usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","SB_Jenkin_docker.jar"]
EXPOSE 9091
