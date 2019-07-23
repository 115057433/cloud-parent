package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 该启动类为eureka的启动类 属于客户端
 * 启动服务后会自动注册进eureka
 * @author xiaoyao
 *
 */
@SpringBootApplication
@EnableZuulProxy
public class DeptGateway_9527 {

	
	public static void main(String[] args) {
		SpringApplication.run(DeptGateway_9527.class, args);
		System.out.println("DeptGateway_9527 start completed");
	}
}
