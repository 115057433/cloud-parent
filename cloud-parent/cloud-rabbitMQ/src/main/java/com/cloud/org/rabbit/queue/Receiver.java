package com.cloud.org.rabbit.queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "orderQueue")
public class Receiver {

	private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);
	
	public void process(String result) {
		LOGGER.info("拿到的orderNumber为"+result);
	}
}
