package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
/**
 * 服务监控
 * @author Administrator
 *
 */
public class Deptconsumer_9001 {

	
	public static void main(String[] args) {
		SpringApplication.run(Deptconsumer_9001.class, args);
		System.out.println("Deptconsumer_9001 start completed");
	}
}
