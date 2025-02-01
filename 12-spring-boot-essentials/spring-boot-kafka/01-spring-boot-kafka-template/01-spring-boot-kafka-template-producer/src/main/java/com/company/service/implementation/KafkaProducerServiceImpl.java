package com.company.service.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.company.dto.ProducerRequest;
import com.company.service.KafkaProducerService;
import com.company.util.ApplicationUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducerServiceImpl implements KafkaProducerService {

	@Value("${kafka.topic.request}")
	private String topicRequest;

	private final KafkaTemplate<String, String> kafkaTemplate;

	@Override
	public String pushMessage(ProducerRequest producerRequest) {

		try {

			System.out.println("producer - " + ApplicationUtils.generateJsonFromObject(producerRequest));

			// topic, key, message
			kafkaTemplate.send(
			      topicRequest,
			      producerRequest.getEmail(),
			      ApplicationUtils.generateJsonFromObject(
			            producerRequest
			      )
			);

			return "producer ~ message sent";

		} catch (Exception exception) {

			return "producer ~ message cannot be sent";

		}

	}

}
