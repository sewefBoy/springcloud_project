package com.online.taxi.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class HyxApiDriverConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverConfigApplication.class, args);
	}

}
