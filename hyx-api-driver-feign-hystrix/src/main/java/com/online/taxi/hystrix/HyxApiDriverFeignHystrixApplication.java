package com.online.taxi.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author yueyi2019
 */

@SpringBootApplication
@EnableCircuitBreaker
@EnableFeignClients
public class HyxApiDriverFeignHystrixApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverFeignHystrixApplication.class, args);
	}
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
