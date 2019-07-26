package com.example.SpringDemo.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/v1/read")
@Slf4j
public class ReadController {

    @GetMapping(path = "/test/{name}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String getUser(@PathVariable String name) {

        return "hello :" + name;
    }
}