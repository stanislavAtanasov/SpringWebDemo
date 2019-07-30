package com.example.spring.web.demo.web.controller;

import com.example.spring.web.demo.dto.UserDto;
import com.example.spring.web.demo.entity.User;
import com.example.spring.web.demo.facade.Facade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/v1/")
@Slf4j
public class Controller {

    private final Facade facade;

    @Autowired
    public Controller(Facade facade) {
        this.facade = facade;
    }

    @GetMapping(path = "get/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public UserDto getUser(Authentication authentication, @PathVariable String username) {
        //todo log authentication
        return facade.fetchUserDTOByUsername(username);
    }

    //todo to change it to Post.  Use get for faster testing
    @GetMapping(path = "create/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String createUser(Authentication authentication, @PathVariable String name) {
        User user = new User();
        user.setUsername(name);
        user.setMail(name + "@gmail.com");
        //todo to add it in Factory !
       // log.info(repository.createUser(user).toString());
        return "Create user with id  :" + user.getId();
    }
}