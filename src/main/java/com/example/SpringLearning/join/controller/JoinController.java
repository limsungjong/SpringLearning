package com.example.SpringLearning.join.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class JoinController {
    @GetMapping("/join")
    public String getUserJoin() {
        return "/join/index";
    }
}
