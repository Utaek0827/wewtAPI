package com.wewtapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.wewtapi.cons"})
public class WewtApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WewtApiApplication.class, args);
    }

}
