package com.bing.vueendtest.controller;

import com.bing.vueendtest.entity.User;
import com.bing.vueendtest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/login")
    public String login(String username, String password) {
         return userService.login(username, password);
    }

    @PostMapping(value = "/register")
    public String register(String username, String password, String email) {
        return userService.register(username, password, email);
    }
}
