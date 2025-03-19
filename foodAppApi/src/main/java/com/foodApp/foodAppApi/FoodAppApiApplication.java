package com.foodApp.foodAppApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.foodApp.foodAppApi.*")
public class FoodAppApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodAppApiApplication.class, args);
	}

}
