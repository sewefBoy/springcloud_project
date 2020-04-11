package com.online.taxi.eureka;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRegisteredEvent;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class CustomEvent {
	
	@EventListener
	public void listen(EurekaInstanceCanceledEvent e) {
//		System.out.println(e.getServerId()+"下线事件");
		//发送邮件，短信，电话。
	}
	
	@EventListener
	public void listenRegist(EurekaInstanceRegisteredEvent e) {
//		System.out.println(e.getInstanceInfo().getAppName()+"注册事件");
	}
	
	@EventListener
	public void listenRenew(EurekaInstanceRenewedEvent e) {
//		System.out.println(e.getInstanceInfo().getAppName()+"续约事件");
	}
	
}
