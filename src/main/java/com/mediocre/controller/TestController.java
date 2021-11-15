package com.mediocre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/test")
    public String test() {
        System.out.println("test log: hello world222.");
        return "Hello World222!";
    }
}
