package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 该启动类为eureka的启动类 属于客户端
 * 启动服务后会自动注册进eureka
 * @author xiaoyao
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient//服务发现
public class DeptProvider_8102 {

	
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_8102.class, args);
		System.out.println("DeptProvider_8102 start completed");
	}
}
