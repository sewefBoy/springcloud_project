package com.online.taxi.ribbon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.ribbon.dto.Emp;

@RestController
public class NetfilxRibbon {
	@Autowired
	RestTemplate restTemplate;
	
	@SuppressWarnings("unchecked")
	@GetMapping("/callRibbon")
	public List<Emp> callRibbon() {
		List<Emp> result = restTemplate.getForObject("http://eureka-client/selectEmp", List.class);
		return result;
	}
}
