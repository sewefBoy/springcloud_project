package com.online.taxi.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigControllerTest {
	
	private String env;
	
	@GetMapping("/env")
	public String test() {
		System.out.println(env);
		return env;
	}
}
