package com.company.service.implementation;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.company.dto.ProducerRequest;
import com.company.service.KafkaConsumerService;
import com.company.util.ApplicationUtils;

@Service
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

	@KafkaListener(
	   topics = "${kafka.topic.request}",
	   groupId = "${kafka.group.id}"
	)
	@SendTo("${kafka.topic.response}")
	@Override
	public String processRequest(String producerRequest) throws InterruptedException {

		System.out.println("consumer - " + producerRequest);

		Thread.sleep(3000);

		// throw new RuntimeException("hey there, exception here!");

		return ApplicationUtils.generateJsonFromObject(
		      ApplicationUtils.generateObjectFromJson(
		            producerRequest, ProducerRequest.class, false
		      )
		);

	}

}
