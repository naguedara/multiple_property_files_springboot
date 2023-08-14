package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootMultiApplicationPropertiesApplication {

	@Value("${app.name}")
	private String appName;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootMultiApplicationPropertiesApplication.class, args);
	}

	@GetMapping("/name")
	public String getName() {
		return appName;
	}
}
