package com.example.spring.web.demo.repository;

import com.example.spring.web.demo.entity.User;

import java.util.Optional;

public interface Repository {
    Optional<User> fetchUserByUsername(String name);
    User createUser(User user);
}