package com.example.springsecurity.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/login")
    public String getUserLogin() {
        return "/user/login";
    }

    @GetMapping("/join")
    public String getUserJoin() {
        return "/user/join";
    }
}
