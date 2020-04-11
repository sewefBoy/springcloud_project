package com.online.taxi.service.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HyxServiceSmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxServiceSmsApplication.class, args);
	}

}
