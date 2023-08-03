package com.example.springsecurity.user.api;

import com.example.springsecurity.user.domain.dto.UserJoinReqBody;
import com.example.springsecurity.user.domain.dto.UserLoginReqBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserAPI {

    @PostMapping("/login")
    public ResponseEntity userLogin(UserLoginReqBody req) {
        return ResponseEntity.ok("login");
    }

    @PostMapping("/join")
    public ResponseEntity userJoin(UserJoinReqBody req) {
        return ResponseEntity.ok("join");
    }
}
