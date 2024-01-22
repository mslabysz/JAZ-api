package com.example.randomuserupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example")
public class RandomUserUpdaterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomUserUpdaterApplication.class, args);
    }

}
