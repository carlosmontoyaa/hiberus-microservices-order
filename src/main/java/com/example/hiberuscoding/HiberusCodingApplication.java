package com.example.hiberuscoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HiberusCodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HiberusCodingApplication.class, args);
	}

}
