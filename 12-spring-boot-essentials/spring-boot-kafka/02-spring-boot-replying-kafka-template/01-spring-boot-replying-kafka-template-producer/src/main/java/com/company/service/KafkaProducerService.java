package com.company.service;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import com.company.dto.ConsumerResponse;
import com.company.dto.ProducerRequest;

public interface KafkaProducerService {

	public abstract ConsumerResponse sendAndReceiveSynchronous(ProducerRequest request) throws InterruptedException, ExecutionException;

	public abstract CompletableFuture<ConsumerResponse> sendAndReceiveAsynchronous(ProducerRequest request) throws InterruptedException, ExecutionException;

}
