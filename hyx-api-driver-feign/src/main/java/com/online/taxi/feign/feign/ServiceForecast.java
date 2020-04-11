package com.online.taxi.feign.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.online.taxi.feign.entity.Emp;

/**
 * 
 * @author yueyi2019
 * http://service-valuation/forecast/single
 */
//@FeignClient(name = "service-valuation",configuration = FeignAuthConfiguration.class)
@FeignClient(name = "eureka-client")
public interface ServiceForecast {
	
	@RequestMapping(value = "/selectEmp",method = RequestMethod.GET)
	public List<Emp> forecast();
	
}
