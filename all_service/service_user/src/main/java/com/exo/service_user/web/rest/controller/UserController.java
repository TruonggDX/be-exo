package com.exo.service_user.web.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {
    Logger logger = LoggerFactory.getLogger(UserController.class);
    @GetMapping("/list")
    public String getUsers() {
        List<String> users = List.of("Truong","ND Kien","Minh David");
        logger.info(users.toString());
        return users.toString();
    }
}