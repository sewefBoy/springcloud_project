package com.online.taxi.client.call_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.taxi.client.entity.Emp;

@RestController
public class FeignCallInter {
	@Autowired
	private FeignCall feignCall; 
	
	@GetMapping("/get")
	public List<Emp> get() {
		List<Emp> result = feignCall.get();
		return result;
	}

}
