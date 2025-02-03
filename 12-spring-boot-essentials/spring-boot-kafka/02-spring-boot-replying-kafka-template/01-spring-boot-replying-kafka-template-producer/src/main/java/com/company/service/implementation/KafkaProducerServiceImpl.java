package com.company.service.implementation;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;
import org.springframework.kafka.requestreply.RequestReplyFuture;
import org.springframework.stereotype.Service;

import com.company.dto.ConsumerResponse;
import com.company.dto.ProducerRequest;
import com.company.service.KafkaProducerService;
import com.company.util.ApplicationUtils;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class KafkaProducerServiceImpl implements KafkaProducerService {

	@Value("${kafka.topic.request}")
	private String topicRequest;

	private final ReplyingKafkaTemplate<String, String, String> replyingKafkaTemplate;

	@Override
	public ConsumerResponse sendAndReceiveSynchronous(
	      ProducerRequest producerRequest
	) throws InterruptedException, ExecutionException {

		System.out.println("synchronous producer - " + ApplicationUtils.generateJsonFromObject(producerRequest));

		ProducerRecord<String, String> producerRecord = new ProducerRecord<>(
		      topicRequest,
		      producerRequest.getUsername(),
		      ApplicationUtils.generateJsonFromObject(producerRequest)
		);

		RequestReplyFuture<String, String, String> requestReplyFuture = replyingKafkaTemplate.sendAndReceive(producerRecord);

		ConsumerRecord<String, String> consumerRecord = requestReplyFuture.get();

		return ApplicationUtils.generateObjectFromJson(
		      consumerRecord.value(),
		      ConsumerResponse.class,
		      false
		);

	}

	@Override
	public CompletableFuture<ConsumerResponse> sendAndReceiveAsynchronous(
	      ProducerRequest producerRequest
	) throws InterruptedException, ExecutionException {

		System.out.println("asynchronous producer - " + ApplicationUtils.generateJsonFromObject(producerRequest));

		ProducerRecord<String, String> producerRecord = new ProducerRecord<>(
		      topicRequest,
		      producerRequest.getUsername(),
		      ApplicationUtils.generateJsonFromObject(producerRequest)
		);

		RequestReplyFuture<String, String, String> requestReplyFuture = replyingKafkaTemplate.sendAndReceive(producerRecord);

		return requestReplyFuture.thenApplyAsync(
		      consumerRecord -> ApplicationUtils.generateObjectFromJson(
		            consumerRecord.value(), ConsumerResponse.class, false
		      )
		).exceptionally(
		      exception -> null
		);

	}

}