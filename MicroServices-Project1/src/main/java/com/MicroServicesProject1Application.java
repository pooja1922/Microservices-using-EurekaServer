package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroServicesProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroServicesProject1Application.class, args);
	}

}
