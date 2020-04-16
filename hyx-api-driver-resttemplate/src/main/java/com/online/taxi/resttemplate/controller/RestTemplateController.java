package com.online.taxi.resttemplate.controller;

import java.util.List;
import java.util.Map;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.online.taxi.resttemplate.entity.Emp;
import com.online.taxi.resttemplate.entity.Person;

@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/re")
	public String rest() {
		return "hahaha";
	}
	
	@GetMapping("/rest")
	public List<Emp> restRequest() {
		List<Emp> result = restTemplate.getForObject("http://eureka-client/selectEmp", List.class);
		return result;
	}
	
	@GetMapping("/rest1")
	public void restRequest1() {
		String url ="http://eureka-client/account/map";
		ResponseEntity<Map> entity = restTemplate.getForEntity(url, Map.class);
		System.out.println("respStr: "  + entity.getBody() );
	}
	
	@GetMapping("/rest2")
	public void restRequest2() {
		String url ="http://eureka-client/account/person";
		ResponseEntity<Person> entity = restTemplate.getForEntity(url, Person.class);
		System.out.println("respStr: "  + ToStringBuilder.reflectionToString(entity.getBody() ));
	}
	
	
}
