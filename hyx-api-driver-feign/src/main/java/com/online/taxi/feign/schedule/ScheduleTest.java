package com.online.taxi.feign.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.online.taxi.common.dto.ResponseResult;
import com.online.taxi.common.dto.order.ForecastRequest;
import com.online.taxi.common.dto.order.ForecastResponse;
import com.online.taxi.feign.entity.Emp;
import com.online.taxi.feign.feign.ServiceForecast;

@Configuration
public class ScheduleTest {
	
	@Autowired
	private ServiceForecast serviceForecast;

	public ResponseResult<ForecastResponse> forecast() {
		System.out.println("定时调用");
		ForecastRequest req = new ForecastRequest();
		req.setEndLatitude("el");
		req.setEndLongitude("el2");
		req.setStartLatitude("sl");
		req.setStartLongitude("sl2");
		List<Emp> result = serviceForecast.forecast();
		
		return ResponseResult.success(result);
	}
}
