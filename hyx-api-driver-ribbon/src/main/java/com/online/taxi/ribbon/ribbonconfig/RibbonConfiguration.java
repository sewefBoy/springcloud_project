package com.online.taxi.ribbon.ribbonconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import com.online.taxi.ribbon.annotation.ExcudeRibbonConfig;
/**
 * 该类不应该在主应用程序的扫描之下，需要修改启动类的扫描配置。
 * 
 * @author yueyi2019
 *
 */
@Configuration
@ExcudeRibbonConfig
public class RibbonConfiguration {

	/**
	 * 修改IRule
	 * @return
	 */
	@Bean
	public IRule ribbonRule() {
//		return new RandomRule();
		return new RoundRobinRule();
	}
	
	/**
	 * 自定义rule
	 * @return
	 */
//	@Bean
//	public IRule ribbonRule() {
//		return new MsbRandomRule();
//	}
	
}
