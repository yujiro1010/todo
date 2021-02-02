package com.todo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.todo.repository.UserRepository;

@Controller
public class RootController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/")
    public String root() {
        return "project_detail";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String postLogin() {
//       UserBean user = userRepository.identifyUser(id);
        return "project_detail";
    }

}
