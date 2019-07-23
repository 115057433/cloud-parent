package com.cloud.org.rabbit.queue;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sender {

	private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);
	
	@Autowired
	private AmqpTemplate amqpTemplate;
	
	
	public void send() {
		String orderMsg = UUID.randomUUID().toString();
		LOGGER.info("orderMsg::::"+orderMsg);
		amqpTemplate.convertAndSend("orderQueue",orderMsg);
	}
}
