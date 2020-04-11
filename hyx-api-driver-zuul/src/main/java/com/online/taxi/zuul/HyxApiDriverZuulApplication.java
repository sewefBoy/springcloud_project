package com.online.taxi.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//该注解声明这是一个zuul代理，该代理使用Ribbon来定位注册到eureka server上的微服务，同时，整合了hystrix，实现了容错。
@EnableZuulProxy
public class HyxApiDriverZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HyxApiDriverZuulApplication.class, args);
	}

}
