package com.online.taxi.feign.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.taxi.feign.service.FeignClientService;


@RestController
@RequestMapping("/feign")
public class FeignController {
	@Autowired
	FeignClientService feignClientService;
	
	@GetMapping("/alive")
	public String alive() {
		return feignClientService.alive();
	}

	
	@GetMapping("/getMap")
	Map<String, String> getMap(){
		return feignClientService.getMap(1001);
	}
	@GetMapping("/getMap2")
	Map<String, String> getMap2(){
		
		return feignClientService.getMap2(1002, "memeda");
	}
	
	@GetMapping("/getMap3")
	Map<String, String> getMap3(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("id","1003");
		map.put("name", "xy3");
		return feignClientService.getMap3(map);
	}
	
	@PostMapping("/postMap")
	Map<String, String> postMap(){
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("id","1004");
		map.put("name", "xy4");
		return feignClientService.postMap(map);
	}

}
