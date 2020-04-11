package com.online.taxi.hystrix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.online.taxi.hystrix.service.RestTemplateRequestService;

@RestController
@RequestMapping("/test")
public class TestController {
	@Autowired
	RestTemplateRequestService restTemplateRequestService;
	
	@GetMapping(value = "/hystrix")
    public String send(){
		//输出收到的参数内容
		
        return restTemplateRequestService.smsSend();
    }
	
	
	
}
