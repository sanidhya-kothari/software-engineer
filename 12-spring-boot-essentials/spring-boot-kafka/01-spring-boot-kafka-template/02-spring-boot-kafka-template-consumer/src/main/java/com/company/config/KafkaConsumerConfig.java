package com.company.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.config.TopicBuilder;

@EnableKafka
@Configuration
public class KafkaConsumerConfig {

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

}
