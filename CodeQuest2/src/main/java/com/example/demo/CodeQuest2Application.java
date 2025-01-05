package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repository")  // Ensure this package is scanned for repositories
@EntityScan(basePackages = "com.example.demo.model")  // Make sure this points to where your entities are located
public class CodeQuest2Application extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CodeQuest2Application.class, args); // Bootstraps the application
    }
}
