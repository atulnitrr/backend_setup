package com.atul.setup.setup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SetupApplication {

	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);

		System.out.println("App is running");
	}

}
