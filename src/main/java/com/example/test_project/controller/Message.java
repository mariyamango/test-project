package com.example.test_project.controller;

import lombok.Getter;

public class Message {
    @Getter
    private final String id;
    private final String name;
    private final String message;

    public Message(String id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
