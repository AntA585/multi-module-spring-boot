package com.house.allen.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.house.allen.persistence"})
@EntityScan(basePackages = {"com.house.allen.domain"})
@ComponentScan(basePackages = {"com.house.allen.persistence","com.house.allen.domain","com.house.allen.web"})
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class);
    }
}
