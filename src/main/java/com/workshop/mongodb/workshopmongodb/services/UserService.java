package com.workshop.mongodb.workshopmongodb.services;

import com.workshop.mongodb.workshopmongodb.domain.User;
import com.workshop.mongodb.workshopmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

}