package com.vishaltechspecialist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsSpringIntegrationApplication {
	
	@GetMapping
	public String message(){
		return "welcome to Vishal";
	}

	public static void main(String[] args) {
		SpringApplication.run(DevopsSpringIntegrationApplication.class, args);
	}

}
