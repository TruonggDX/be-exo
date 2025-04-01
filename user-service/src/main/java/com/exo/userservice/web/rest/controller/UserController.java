package com.exo.userservice.web.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping("/list")
    public String getUsers() {
        return "Danh sách users từ User Service";
    }
}