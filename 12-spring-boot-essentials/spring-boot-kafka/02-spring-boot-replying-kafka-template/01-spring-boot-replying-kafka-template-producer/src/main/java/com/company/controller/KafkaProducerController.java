package com.company.controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.ConsumerResponse;
import com.company.dto.ProducerRequest;
import com.company.service.KafkaProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/producer")
@RequiredArgsConstructor
public class KafkaProducerController {

	private final KafkaProducerService kafkaProducerService;

	@PostMapping(path = "/send-and-receive/synchronous")
	public ResponseEntity<ConsumerResponse> sendAndReceiveSynchronous(
	      @RequestBody(required = true) ProducerRequest request
	) throws InterruptedException, ExecutionException {

		return new ResponseEntity<>(
		      kafkaProducerService.sendAndReceiveSynchronous(request),
		      HttpStatus.OK
		);

	}

	@PostMapping(path = "/send-and-receive/asynchronous")
	public CompletableFuture<ConsumerResponse> sendAndReceiveAsynchronous(
	      @RequestBody(required = true) ProducerRequest request
	) throws InterruptedException, ExecutionException {

		return kafkaProducerService.sendAndReceiveAsynchronous(request);

	}

}