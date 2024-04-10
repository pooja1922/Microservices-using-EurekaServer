package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.CartService.Proxy")
public class Application {

	public static void main(String[] args) {
		System.out.println("application start");
		SpringApplication.run(Application.class, args);
		System.out.println("application stop");
	}

}
