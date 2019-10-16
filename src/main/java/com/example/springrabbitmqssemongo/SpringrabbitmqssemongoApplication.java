package com.example.springrabbitmqssemongo;

import com.example.springrabbitmqssemongo.web.properties.ExampleQueueProperties;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.mongo.MongoDataAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableConfigurationProperties({ExampleQueueProperties.class})
@EnableRabbit
@SpringBootApplication
public class SpringrabbitmqssemongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringrabbitmqssemongoApplication.class, args);
	}

}
