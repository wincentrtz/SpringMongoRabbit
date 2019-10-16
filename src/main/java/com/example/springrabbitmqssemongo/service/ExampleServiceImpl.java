package com.example.springrabbitmqssemongo.service;

import com.example.springrabbitmqssemongo.model.User;
import com.example.springrabbitmqssemongo.repository.ExampleRepository;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
class ExampleServiceImpl implements ExampleService {

    @Autowired
    ExampleRepository exampleRepository;

    @Autowired
    RabbitTemplate rabbitTemplate;

    @Autowired
    Queue queue;

    @Override
    public List<User> getUserData() {
        List<User> examples = exampleRepository.findAll();
        examples.forEach(ex ->  rabbitTemplate.convertAndSend(this.queue.getName(), ex.getName()));
        return examples;
    }

    @RabbitListener(queues = {"ExampleQueue"})
    @Override
    public void rabbitConsumer(String message) {
        System.out.println("HELLO " +message);
    }
}
