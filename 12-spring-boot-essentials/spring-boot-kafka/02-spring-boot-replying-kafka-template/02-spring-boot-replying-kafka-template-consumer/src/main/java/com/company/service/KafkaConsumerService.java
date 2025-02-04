package com.company.service;

public interface KafkaConsumerService {

	public abstract String processRequest(String request) throws InterruptedException;

}
