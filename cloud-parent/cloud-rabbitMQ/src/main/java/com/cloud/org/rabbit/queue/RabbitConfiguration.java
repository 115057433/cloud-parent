package com.cloud.org.rabbit.queue;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class RabbitConfiguration {

	@Bean
	public Queue ueue() {
		return new Queue("orderQueue");
	}
}
