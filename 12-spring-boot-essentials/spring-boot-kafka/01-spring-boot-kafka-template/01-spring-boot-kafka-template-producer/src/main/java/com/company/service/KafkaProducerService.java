package com.company.service;

import com.company.dto.ProducerRequest;

public interface KafkaProducerService {

	public abstract String pushMessage(ProducerRequest producerRequest);

}
