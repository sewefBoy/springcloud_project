package com.online.taxi.feign.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.Logger;

@Configuration
public class FeiginConfig {

	@Bean
	Logger.Level logLevel(){
		
		return Logger.Level.BASIC;
	}
}