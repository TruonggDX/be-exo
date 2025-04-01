package com.exo.service_exo.web.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/exo")
public class ExoController {
    @GetMapping("/list")
    public String getExo() {
        List<String> ex = List.of("EXO1","EXO2","EXO3");
        return ex.toString();
    }
}