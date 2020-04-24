package com.online.taxi.feign.service;

import java.util.Collections;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.user.api.Person;
@Component
public class FallBack implements FeignClientService{

	@Override
	public String alive() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person postPserson(Person person) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getMap(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("hahah 熔断了");
		return Collections.singletonMap("123", "hahah 熔断了");
	}

	@Override
	public Map<String, String> getMap2(Integer id, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> getMap3(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, String> postMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
