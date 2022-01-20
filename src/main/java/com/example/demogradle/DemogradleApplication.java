package com.example.demogradle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class DemogradleApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(DemogradleApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemogradleApplication.class, args);
		LOGGER.info("Springboot actuator application is started successfully.");
	}

}
