package com.example.springrabbitmqssemongo.web.configuration;

import com.example.springrabbitmqssemongo.web.properties.ExampleQueueProperties;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ExampleQueueConfiguration {

    @Autowired
    ExampleQueueProperties exampleMessageQueue;

    @Bean
    public Queue queue() {
        return new Queue(exampleMessageQueue.getName(), true);
    }
}
