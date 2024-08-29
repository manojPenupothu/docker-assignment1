#spring-docker-demo

Simple dockerized Spring Boot application for student management

##Requirements

For building the application we need:

 -[JDK 1.8]
 -[Maven 3]
 -[Docker 20.10]
 
##Running the application locally
 
 There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `com.spring.docker.demo.SpringDockerDemoApplication` class from your IDE.
 
##Running the application using Docker
 
 #Pre-requisites
 
	Docker 20.10 installation using WSL ubuntu.
  
	Docker Compose installation on ubuntu

#Steps
1. Run the ./spring-docker-demo/src/main/resources/dockerfile using command [docker build -t .] to create docker image.
2. Using [docker run <image-id>] create a container from the docker image.
3. Use [docker-compose up -d ] to run the supporting services of the application. In this case MySql Database.

 