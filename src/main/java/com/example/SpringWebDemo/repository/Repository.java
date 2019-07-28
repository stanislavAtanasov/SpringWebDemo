package com.example.SpringWebDemo.repository;

import com.example.SpringWebDemo.entity.User;

import java.util.Optional;

public interface Repository {
    Optional<User> fetchUserByName(String name);
    User createUser(User user);
}