# Eureka-project


steps for eureka server setup:

1. create a folder/repo with the project name (Ex : eureka project )

2. navigate to the directory .

3. open spring initialzr and add Eureka server as the dependency

4. download the zip file inside the main project (discovery-server).

5. naviagate to project/discovery-server and set the application.properties as given.

6. run the mvnw file and open localhost:port_no to access eureka dashboard


steps for eureka client setup:

1. to develop a full web spring project open spring intialzr and add following dependency

 ```
 spring web
 Mysql driver
 Spring data JPAsta
 Eureka client
 ```
 
2. download the client as zip file in main project folder with service_name for the zip file.

3. make sure to add @EnableEurekaClient and @EnableEurekaServer in both discovery and services' application.java file 

4. add the application.properties for the eureka client and make sure mysql is running in your system.

5. run the mnvw file for the client and open the same eureka server dashboard to see the registered service 

  
