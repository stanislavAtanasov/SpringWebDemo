package com.example.spring.web.demo.service;

import com.example.spring.web.demo.entity.User;
import com.example.spring.web.demo.repository.Repository;
import lombok.extern.slf4j.Slf4j;

import javax.persistence.EntityNotFoundException;

@org.springframework.stereotype.Service
@Slf4j
public class Service {
    private final Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public User fetchUserByUsername(String username) {
        return repository.fetchUserByUsername(username).orElseThrow(() -> new EntityNotFoundException()
        );
    }
}
