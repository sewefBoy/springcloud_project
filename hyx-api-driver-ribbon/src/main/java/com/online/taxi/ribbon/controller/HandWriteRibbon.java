package com.online.taxi.ribbon.controller;

import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.ribbon.dto.Emp;

@RestController
public class HandWriteRibbon {
	@Autowired
	RestTemplate restTemplate;
	@Autowired
	DiscoveryClient discoveryClient;
	
	//随机策略
	@SuppressWarnings("unchecked")
	@GetMapping("/handWriteRibbon1")
	public List<Emp> handWriteRibbon1(){
		
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("eureka-client");
		
		ServiceInstance serviceInstance = serviceInstances.get(new Random().nextInt(serviceInstances.size()));
		
		System.out.println("调用服务的端口号：  "+serviceInstance.getHost() +":" +serviceInstance.getPort());
		List<Emp> result = restTemplate.getForObject(serviceInstance.getUri()+"/selectEmp", List.class);
		return result;
	}
	
	//轮询策略
	AtomicInteger counts = new AtomicInteger();
	@SuppressWarnings("unchecked")
	@GetMapping("/handWriteRibbon2")
	public List<Emp> handWriteRibbon2(){
		
		List<ServiceInstance> serviceInstances = discoveryClient.getInstances("eureka-client");
		
		int i = counts.getAndIncrement();
		ServiceInstance serviceInstance = serviceInstances.get( i % serviceInstances.size() );
		
		System.out.println("调用服务的端口号：  "+serviceInstance.getHost() +":" +serviceInstance.getPort());
		List<Emp> result = restTemplate.getForObject(serviceInstance.getUri()+"/selectEmp", List.class);
		return result;
	}

}
