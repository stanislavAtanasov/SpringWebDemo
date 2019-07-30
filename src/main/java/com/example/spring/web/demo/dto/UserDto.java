package com.example.spring.web.demo.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonPropertyOrder(value = {"id", "username", "mail"})
public class UserDto {

    private Integer id;

    private String username;
    private String mail;
}