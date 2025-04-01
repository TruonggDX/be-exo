package com.exo.service_user.web.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/list")
    public String getUsers() {
        List<String> users = List.of("Truong","ND Kien","Minh David");
        return users.toString();
    }
}