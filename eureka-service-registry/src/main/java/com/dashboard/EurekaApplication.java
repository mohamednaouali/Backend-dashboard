package com.dashboard;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
        System.out.println("Start a Eureka Service Registry ..... Eureka status is  UP ");
        System.out.println("************************************ Starting Eureka Service Registry and Discovery please wait ************************************");
        System.out.println("************************************ Eureka Service Registry and Discovery is UP ************************************");
    }
}
