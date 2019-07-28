package com.example.SpringWebDemo.repository.implementations;


import com.example.SpringWebDemo.entity.User;
import com.example.SpringWebDemo.repository.Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@Slf4j
public class SpringDataJPAImpl implements Repository {

    @Autowired
    SpringDataJPA repository;

    @Override
    public Optional<User> fetchUserByName(String name) {
        log.info("called fetch by name:%s", name);
        return repository.findByUsername(name);
    }

    @Override
    public User  createUser(User user) {
        log.info("called createUser by name:%s", user);
        //todo check if user is in DB !
        return repository.save(user);
    }
}