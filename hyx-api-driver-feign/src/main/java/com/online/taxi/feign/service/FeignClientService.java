package com.online.taxi.feign.service;

import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.user.api.UserApi;

//@FeignClient( name= "eureka-client", fallback = FallBack.class )
@FeignClient( name= "eureka-client", fallbackFactory = FeignFallBackFactory.class )

public interface FeignClientService extends UserApi{
	
	@GetMapping("/getMap")
	Map<String, String> getMap(@RequestParam("id") Integer id);
	@GetMapping("/getMap2")
	Map<String, String> getMap2(@RequestParam("id") Integer id,@RequestParam("name") String name);
	
	@GetMapping("/getMap3")
	Map<String, String> getMap3(@RequestParam Map<String, Object> map);
	
	@PostMapping("/postMap")
	Map<String, String> postMap(Map<String, Object> map);

}
