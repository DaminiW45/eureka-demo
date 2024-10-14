package com.cgs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PractiseeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PractiseeeApplication.class, args);
	}

}
