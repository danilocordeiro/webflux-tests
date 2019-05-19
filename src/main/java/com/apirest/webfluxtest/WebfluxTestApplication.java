package com.apirest.webfluxtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebfluxTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxTestApplication.class, args);
        System.out.println("Olá");
    }

}
