package com.cloud.org.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 注解配置类
 * @author Administrator
 *
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
//	@Bean
//	public IRule myRule() {
//		return new RoundRobinRule();
//	}
}
