package com.online.taxi.client.controller;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.taxi.client.entity.Person;

@RestController
@RequestMapping("/account")
public class AccountController {
	
	@Value("${server.port}")
	private int port;

	@GetMapping("/map")
	public Map<String, Integer> getMap(){
		Map<String, Integer> map = Collections.singletonMap("port", port);
		return map;
	}
	
	@GetMapping("/person")
	public Person getPerson(){
		Person per = new Person();
		per.setId(1001);
		per.setName("小云");
		per.setPort(port);
		return per;
	}
}
