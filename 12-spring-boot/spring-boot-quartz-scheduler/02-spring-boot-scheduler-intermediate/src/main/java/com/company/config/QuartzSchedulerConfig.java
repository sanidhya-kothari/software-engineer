package com.company.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.quartz.QuartzDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class QuartzSchedulerConfig {

	@Bean
	@QuartzDataSource
	@ConfigurationProperties(prefix = "spring.datasource")
	DataSource quartzDataSource() {
		return DataSourceBuilder.create().build();
	}

}
