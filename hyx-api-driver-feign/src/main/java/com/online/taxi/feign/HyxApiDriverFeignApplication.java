package com.online.taxi.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.feign.annotation.ExcudeFeignConfig;

/**
 * @author yueyi2019
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
//@ComponentScan(excludeFilters = {
//		@ComponentScan.Filter(type = FilterType.ANNOTATION,value=ExcudeFeignConfig.class)
//})
public class HyxApiDriverFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverFeignApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
