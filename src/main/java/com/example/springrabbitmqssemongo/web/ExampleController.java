package com.example.springrabbitmqssemongo.web;

import com.example.springrabbitmqssemongo.model.User;
import com.example.springrabbitmqssemongo.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/")
class ExampleController {

    @Autowired
    ExampleService exampleService;

    @GetMapping
    public List<User> getUserData() {
        return exampleService.getUserData();
    }
}
