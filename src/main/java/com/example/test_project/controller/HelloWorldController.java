package com.example.test_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// http://localhost:8080/api/hello
@RequestMapping("/api")
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }
}
