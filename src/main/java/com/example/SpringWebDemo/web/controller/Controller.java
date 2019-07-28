package com.example.SpringWebDemo.web.controller;

import com.example.SpringWebDemo.entity.User;
import com.example.SpringWebDemo.repository.Repository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/")
@Slf4j
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping(path = "/get/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getUser(@PathVariable String name) {
        return  repository.fetchUserByName(name)
                .map(d ->"Hello "+d.getUsername())
                .orElse("No such user with username: "+name);
    }

    @GetMapping(path = "/create/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String createUser(@PathVariable String name) {
        User user = new User();
        user.setUsername(name);
        user.setMail(name+"@gmail.com");
        log.info(repository.createUser(user).toString());
        return "Create user with id  :" + user.getId();
    }
}