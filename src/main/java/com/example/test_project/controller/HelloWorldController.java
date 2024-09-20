package com.example.test_project.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
// http://localhost:8080/api/hello
// http://localhost:8080/api/hello/{name}
@RequestMapping("/api")
public class HelloWorldController {
    private List<Message> messages = new ArrayList<>();

    @GetMapping("/hello")
    public String hello(){
        return "Hello, World!";
    }

    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable("name") String name){
        return "Hello, " + name + "!";
    }

    @PostMapping("/messages")
    public String addNewMessage(@RequestBody Message message){
        messages.add(message);
        return messages.toString();
    }

    @GetMapping("/messages")
    public String messages(){
        return messages.toString();
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable("id") String id){
        messages.removeIf(el -> el.getId().equals(id));
        return messages.toString();
    }
}
