package com.example.springsecurity.controller;

import com.example.springsecurity.DTO.UserRequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class RestUserController {
    @PostMapping("/join")
    public ResponseEntity<String> userJoin(UserRequestBody DTO) {

        return ResponseEntity.ok("success");
    }
}
