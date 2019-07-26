package com.atul.setup.setup;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SetupApplication implements CommandLineRunner {


	public static void main(String[] args) {
		SpringApplication.run(SetupApplication.class, args);

		System.out.println("App is running");
	}




	@Autowired
	private RabbitTemplate rabbitTemplate;

	@Override
	public void run(final String... args) throws Exception {
		rabbitTemplate.convertAndSend("Hello from our first message ");
	}
}
