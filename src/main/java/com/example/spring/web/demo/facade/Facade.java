package com.example.spring.web.demo.facade;

import com.example.spring.web.demo.dto.UserDto;
import com.example.spring.web.demo.service.Service;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Facade {

    private final Service service;
    @Autowired
    private ModelMapper modelMapper;

    public Facade(Service service) {
        this.service = service;
    }

    public UserDto fetchUserDTOByUsername(String username) {
        return modelMapper.map(service.fetchUserByUsername(username), UserDto.class);
    }

}
