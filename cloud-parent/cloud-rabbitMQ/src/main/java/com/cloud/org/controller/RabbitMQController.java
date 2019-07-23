package com.cloud.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cloud.org.rabbit.queue.Sender;

@RestController
public class RabbitMQController {

	@Autowired
	private Sender sender;
	
	
	@RequestMapping("/rabbit/send/")
	public void sendTest() {
		sender.send();
	}
}
