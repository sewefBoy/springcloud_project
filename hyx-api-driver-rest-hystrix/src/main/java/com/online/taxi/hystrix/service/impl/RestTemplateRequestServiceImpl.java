package com.online.taxi.hystrix.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.online.taxi.hystrix.service.RestTemplateRequestService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class RestTemplateRequestServiceImpl implements RestTemplateRequestService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	@HystrixCommand(fallbackMethod = "sendFail")
	public String smsSend() {
		
		// 下面是故意跑出异常代码
//		try {
			int i = 1/0;
//		} catch (Exception e) {
//			// TODO: handle exception
//			throw new BusinessException("熔断忽略的异常，继承HystrixBadRequestException");
////			throw new HystrixIgnoreException("熔断忽略的异常，忽略属性设置");
//		}
		
		String url = "http://eureka-client/selectEmp";
		return restTemplate.getForEntity(url, String.class).getBody();
	}
	
	
	private String sendFail(Throwable throwable) {
		log.info("异常信息:"+throwable.getMessage());
		//备用逻辑
		
		return "       restTemplate熔断";
	}

}
