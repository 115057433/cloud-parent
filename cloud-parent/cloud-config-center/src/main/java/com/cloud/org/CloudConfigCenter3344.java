package com.cloud.org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigCenter3344 {

	//http://config-3344.com:3344/application-dev.yml
	public static void main(String[] args) {
		SpringApplication.run(CloudConfigCenter3344.class, args);
		System.out.println("CloudConfigCenter3344 start completed");
	}
}
