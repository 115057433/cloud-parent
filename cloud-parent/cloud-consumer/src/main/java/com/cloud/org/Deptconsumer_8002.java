package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import cc.rule.nn.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//自定义负载均衡算法策略配置
@RibbonClient(name="CLOUD-DEPT",configuration = MySelfRule.class)
public class Deptconsumer_8002 {

	
	public static void main(String[] args) {
		SpringApplication.run(Deptconsumer_8002.class, args);
		System.out.println("Deptconsumer_8002 start completed");
	}
}
