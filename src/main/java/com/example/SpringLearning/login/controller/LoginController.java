package com.example.SpringLearning.login.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class LoginController {
    @GetMapping("/login")
    public String getUserLogin() {
        return "/login/index";
    }
}
