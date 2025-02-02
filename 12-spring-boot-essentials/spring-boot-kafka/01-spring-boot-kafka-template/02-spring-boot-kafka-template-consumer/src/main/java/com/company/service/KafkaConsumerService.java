package com.company.service;

public interface KafkaConsumerService {

	public abstract void pullMessage(String request);

}
