package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudEureka7001 {

	public static void main(String[] args) {
		SpringApplication.run(CloudEureka7001.class, args);
	}
}
