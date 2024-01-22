package com.example.randomuserwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication (scanBasePackages = {"com.example.randomuserwebapi", "com.example.randomuserdata"})
public class RandomUserWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomUserWebApiApplication.class, args);
    }

}
