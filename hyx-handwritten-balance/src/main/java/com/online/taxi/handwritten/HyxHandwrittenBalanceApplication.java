package com.online.taxi.handwritten;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HyxHandwrittenBalanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxHandwrittenBalanceApplication.class, args);
	}

}
