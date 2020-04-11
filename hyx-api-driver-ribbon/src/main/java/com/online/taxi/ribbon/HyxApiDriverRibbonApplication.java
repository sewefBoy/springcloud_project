package com.online.taxi.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.ribbon.annotation.ExcudeRibbonConfig;

@SpringBootApplication
@ComponentScan(excludeFilters = {
		@ComponentScan.Filter(type = FilterType.ANNOTATION,value=ExcudeRibbonConfig.class)
})
// 下面是让所有client都实现随机策略
//@RibbonClients(defaultConfiguration = RibbonConfiguration.class)
//@RibbonClient(name = "eureka-client",configuration = RibbonConfiguration.class)
public class HyxApiDriverRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverRibbonApplication.class, args);
	}
	
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * 手写简单ribbon
	 * @return
	 */
//	@Bean
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}
	
}
