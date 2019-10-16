package com.example.springrabbitmqssemongo.service;

import com.example.springrabbitmqssemongo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ExampleService {

    List<User> getUserData();
    void rabbitConsumer(String message);
}
