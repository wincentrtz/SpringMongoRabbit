package com.example.springrabbitmqssemongo.repository;

import com.example.springrabbitmqssemongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleRepository extends MongoRepository<User, Integer> {
}
