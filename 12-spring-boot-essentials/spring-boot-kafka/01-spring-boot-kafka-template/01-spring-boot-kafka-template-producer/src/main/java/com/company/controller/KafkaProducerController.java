package com.company.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.dto.ProducerRequest;
import com.company.service.KafkaProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "/api/v1/producer")
@RequiredArgsConstructor
public class KafkaProducerController {

	private final KafkaProducerService kafkaProducerService;

	@PostMapping(path = "/produce")
	public ResponseEntity<String> produce(
	      @RequestBody(required = true) ProducerRequest producerRequest
	) {

		// return ResponseEntity.status(HttpStatus.OK).body(kafkaProducerService.pushMessage(producerRequest));

		return new ResponseEntity<>(
		      kafkaProducerService.pushMessage(producerRequest),
		      HttpStatus.OK
		);

	}

}
