package com.briup.sb.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String get() {
        return "今天有点冷";
    }

    @PostMapping("/kl")
    public String ji() {
        return "昨天刚到";
    }

}
