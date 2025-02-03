package com.company.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.kafka.core.ProducerFactory;
import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;
import org.springframework.kafka.requestreply.ReplyingKafkaTemplate;

@EnableKafka
@Configuration
public class KafkaProducerConfig {

	@Value("${kafka.group.id}")
	private String groupId;

	@Value("${kafka.topic.request}")
	private String topicRequest;

	@Value("${kafka.topic.response}")
	private String topicResponse;

	@Bean
	NewTopic newTopicRequest() {
		// return new NewTopic(topicRequest, 5, (short) 1);
		return TopicBuilder.name(topicRequest).partitions(5).replicas(1).build();
	}

	@Bean
	NewTopic newTopicResponse() {
		// return new NewTopic(topicResponse, 5, (short) 1);
		return TopicBuilder.name(topicResponse).partitions(5).replicas(1).build();
	}

	@Bean
	ReplyingKafkaTemplate<String, String, String> replyingKafkaTemplate(
	      ProducerFactory<String, String> producerFactory,
	      ConcurrentMessageListenerContainer<String, String> repliesContainer
	) {
		return new ReplyingKafkaTemplate<>(producerFactory, repliesContainer);
	}

	@Bean
	ConcurrentMessageListenerContainer<String, String> repliesContainer(
	      ConcurrentKafkaListenerContainerFactory<String, String> containerFactory
	) {
		ConcurrentMessageListenerContainer<String, String> repliesContainer = containerFactory.createContainer(topicResponse);
		repliesContainer.getContainerProperties().setGroupId(groupId);
		repliesContainer.setAutoStartup(false);
		return repliesContainer;
	}

//	@Bean
//	ReplyingKafkaTemplate<String, ProducerRequest, ConsumerResponse> replyingKafkaTemplate(
//	      ProducerFactory<String, ProducerRequest> producerFactory,
//	      ConcurrentKafkaListenerContainerFactory<String, ConsumerResponse> containerFactory
//	) {
//		ConcurrentMessageListenerContainer<String, ConsumerResponse> containerResponse = containerFactory.createContainer(topicResponse);
//		containerResponse.getContainerProperties().setGroupId(groupId);
//		containerResponse.getContainerProperties().setMissingTopicsFatal(false);
//		return new ReplyingKafkaTemplate<>(producerFactory, containerResponse);
//	}
//
//	@Bean
//	KafkaTemplate<String, ConsumerResponse> kafkaTemplate(
//	      ProducerFactory<String, ConsumerResponse> producerFactory,
//	      ConcurrentKafkaListenerContainerFactory<String, ConsumerResponse> containerFactory
//	) {
//		KafkaTemplate<String, ConsumerResponse> kafkaTemplate = new KafkaTemplate<>(producerFactory);
//		containerFactory.getContainerProperties().setMissingTopicsFatal(false);
//		containerFactory.setReplyTemplate(kafkaTemplate);
//		return kafkaTemplate;
//	}

}
