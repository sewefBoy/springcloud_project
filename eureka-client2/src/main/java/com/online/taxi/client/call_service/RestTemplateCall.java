package com.online.taxi.client.call_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.client.entity.Emp;

@RestController
public class RestTemplateCall {
	
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/restTemplateCall")
	public List<Emp> restTemplateCall() {
		System.out.println("进入client2");
		List<Emp> result = restTemplate.getForObject("http://eureka-client/selectEmp", List.class);
		return result;
	}

}
