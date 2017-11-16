package com.example.Logger.LoggerImplementation;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.example.Logger.*"})// same as @Configuration @EnableAutoConfiguration @ComponentScan combined
public class LoggerImplementationApplication {

	private static final Logger logger = LogManager.getLogger(LoggerImplementationApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(LoggerImplementationApplication.class, args);
	}
	
	
}
