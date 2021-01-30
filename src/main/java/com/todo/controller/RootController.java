package com.todo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RootController {
    @RequestMapping("/")
    public String root() {
        return "project_detail";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
