package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = "com.cloud.org")
@ComponentScan("com.cloud.org")
public class Deptconsumer_8300_feign {

	
	public static void main(String[] args) {
		SpringApplication.run(Deptconsumer_8300_feign.class, args);
		System.out.println("Deptconsumer_8300_feign start completed");
	}
}
