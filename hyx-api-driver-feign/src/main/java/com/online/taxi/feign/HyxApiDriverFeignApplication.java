package com.online.taxi.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableHystrixDashboard
@EnableCircuitBreaker
public class HyxApiDriverFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverFeignApplication.class, args);
	}

}
