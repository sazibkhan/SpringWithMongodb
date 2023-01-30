package com.nagalay.SpringWithMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.SpringVersion;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
public class SpringWithMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringWithMongodbApplication.class, args);
		System.out.println("SpringWithMongodbApplication");
	}

}
