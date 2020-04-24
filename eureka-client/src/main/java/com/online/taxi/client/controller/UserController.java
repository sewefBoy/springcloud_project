package com.online.taxi.client.controller;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.api.Person;
import com.user.api.UserApi;

@RestController
public class UserController implements UserApi {

	
	@Value("${server.port}")
	String port;
	
	
	private AtomicInteger count = new AtomicInteger();
	
	@Override
	public String alive() {

		try {
			System.out.println("准备睡");
			
			Thread.sleep(5005);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException("运行时间超时,修改睡眠时间");
		}

		int i = count.getAndIncrement();
		System.out.println(port + " 好的 ====第：" + i + "次调用");
		return "port:" + port;
	}

	@Override
	public String getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@GetMapping("/getMap")
	public Map<String, String> getMap(@RequestParam("id") Integer id) {
		try {
			int a = 1/0;
		}
		catch(Exception e) {
			e.getStackTrace();
			throw new RuntimeException("除0异常了");
		}
		System.out.println(id);
		return Collections.singletonMap(port, "mmeme");
	}
	@GetMapping("/getMap2")
	public Map<String, String> getMap2(Integer id,String name) {
		// TODO Auto-generated method stub
		System.out.println(id);
		return Collections.singletonMap(port, name);
	}
	
	@GetMapping("/getMap3")
	public Map<String, String> getMap3(@RequestParam Map<String, Object> map) {
		// TODO Auto-generated method stub
		System.out.println(map);
		return Collections.singletonMap(port, map.get("name").toString());
	}
	
	
	@PostMapping("/postMap")
	public Map<String, String> postMap(@RequestBody Map<String, Object> map) {
		// TODO Auto-generated method stub
		System.out.println(map);
		return Collections.singletonMap(port, map.get("name").toString());
	}

	@Override
	public Person postPserson(Person person) {
		System.out.println(ToStringBuilder.reflectionToString(person));
		return person;
	}


}