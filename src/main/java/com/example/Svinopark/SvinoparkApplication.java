package com.example.Svinopark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SvinoparkApplication {
	public static ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(SvinoparkApplication.class, args);
	}

}
