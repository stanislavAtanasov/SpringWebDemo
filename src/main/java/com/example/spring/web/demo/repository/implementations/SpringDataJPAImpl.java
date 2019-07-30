package com.example.spring.web.demo.repository.implementations;


import com.example.spring.web.demo.entity.User;
import com.example.spring.web.demo.repository.Repository;
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
    public Optional<User> fetchUserByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public User createUser(User user) {
        log.info("called createUser by name:%s", user);
        //todo check if user is in DB !
        return repository.save(user);
    }
}