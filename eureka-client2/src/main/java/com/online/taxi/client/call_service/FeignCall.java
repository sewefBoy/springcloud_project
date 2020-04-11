package com.online.taxi.client.call_service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.online.taxi.client.entity.Emp;

@FeignClient(name = "eureka-client")
public interface FeignCall {

    @GetMapping("/selectEmp")
    public List<Emp> get();
}
