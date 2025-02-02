package com.company.service.implementation;

import org.springframework.kafka.annotation.KafkaListener;
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
	@Override
	public void pullMessage(String request) {

		System.out.println("consumer - " + request);

		ApplicationUtils.generateObjectFromJson(request, ProducerRequest.class, false);

	}

}