package com.config.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.config.client.component.GitConfig;
import com.config.client.service.ConfigService;
/**测试获取属性的类
 * @author yueyi2019
 */
@RefreshScope
@RestController
@RequestMapping("/config")
public class ConfigController {

	@Autowired
	private GitConfig gitConfig;

	@Autowired
	private ConfigService configService;
	
	@Value("${env}")
	private String env;
	
	@GetMapping("/env0")
	public String env0() {
		return "远程："+env;
	}

	@GetMapping("/env")
	public String env() {
		return gitConfig.getEnv();
	}
	
	@GetMapping("/env1")
	public String env1() {

		return configService.getEnv1();
	}

	@GetMapping("/env2")
	public String env2() {
		return configService.getEnv2();
	}
}