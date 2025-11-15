package com.edu.vnrvjiet.bms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookmanagementserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookmanagementserviceApplication.class, args);
        System.out.println("Tomcat running for Book Management Microservice...");
    }

}
