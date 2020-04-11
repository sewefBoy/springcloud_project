package com.online.taxi.handwritten.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/**
 * @author yueyi2019
 */
@RestController
@RequestMapping("/sms")
public class SmsController {
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/choseServiceName")
	public List choseServiceName() {
		String serviceName = "eureka-client";
		//手写 ribbon调用
		ServiceInstance instance = loadBalance(serviceName);
		String url = "http://" + instance.getHost()+":"+instance.getPort()+"/selectEmp";
		System.out.println(url);
		List result = restTemplate.getForObject(url, List.class);
		
		return result;
	}
	
	
	@Autowired
	DiscoveryClient discoveryClient;
	
	private ServiceInstance loadBalance(String serviceName) {
		List<ServiceInstance> instances = discoveryClient.getInstances(serviceName);
		ServiceInstance instance = instances.get(new Random().nextInt(instances.size()));
		System.out.println("负载均衡 选出来的ip："+instance.getHost()+",端口："+instance.getPort());
		return instance;
	}
	
	
}
