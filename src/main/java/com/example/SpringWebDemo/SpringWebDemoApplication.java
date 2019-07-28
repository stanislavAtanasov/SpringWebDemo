package com.example.SpringWebDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.SpringWebDemo.repository.implementations")
public class SpringWebDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringWebDemoApplication.class, args);
    }

}
