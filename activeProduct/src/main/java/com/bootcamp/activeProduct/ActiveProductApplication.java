package com.bootcamp.activeProduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication

@EnableEurekaClient
public class ActiveProductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActiveProductApplication.class, args);
	}

}
