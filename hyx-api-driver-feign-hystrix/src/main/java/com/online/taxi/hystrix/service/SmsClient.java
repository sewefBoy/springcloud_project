package com.online.taxi.hystrix.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.online.taxi.hystrix.service.impl.SmsClientFallback;
/**
 * @author yueyi2019
 */
@FeignClient(name = "eureka-client",fallback = SmsClientFallback.class)
public interface SmsClient {
	/**
	 * 按照短信模板发送验证码
	 * @param smsSendRequest
	 * @return
	 */
	@RequestMapping(value="/selectEmp", method = RequestMethod.GET)
	public String sendSms();
}
