package com.klef.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.klef.springboot")


public class SDPProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SDPProjectApplication.class, args);
		System.out.println("Spring Boot Web MVC");
	}

}
