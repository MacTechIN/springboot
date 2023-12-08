package com.tutorials.tutor01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("[Hello Controller] -> ");
        return "home";
    }
}
