package com.online.taxi.hystrix.service.impl;

import org.springframework.stereotype.Component;

import com.online.taxi.hystrix.service.SmsClient;
@Component
public class SmsClientFallback implements SmsClient{


	@Override
	public String sendSms() {
		System.out.println("gg  不好意思我熔断了");
		return "gg  不好意思我熔断了";
	}
}

