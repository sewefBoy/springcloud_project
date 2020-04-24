package com.online.taxi.feign.service;

import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.user.api.Person;

import feign.hystrix.FallbackFactory;

@Component
public class FeignFallBackFactory implements FallbackFactory<FeignClientService>{

	@Override
	public FeignClientService create(Throwable cause) {
		// TODO Auto-generated method stub
		return new FeignClientService() {
			
			@Override
			public Person postPserson(Person person) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String getById(Integer id) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public String alive() {
				System.out.println("工厂熔断");
				System.out.println("异常原因：  "+cause.getMessage());
				return "alive()"+ "工厂熔断" + cause.getMessage();
			}
			
			@Override
			public Map<String, String> postMap(Map<String, Object> map) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, String> getMap3(Map<String, Object> map) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, String> getMap2(Integer id, String name) {
				// TODO Auto-generated method stub
				return null;
			}
			
			@Override
			public Map<String, String> getMap(Integer id) {
				// TODO Auto-generated method stub
				System.out.println("工厂熔断");
				System.out.println("异常原因：  "+cause.getMessage());
				return Collections.singletonMap(cause.getMessage(), "工厂熔断");
			}
		};
	}

	

}
