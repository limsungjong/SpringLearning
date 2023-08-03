package com.example.springsecurity.user.api;

import com.example.springsecurity.user.domain.dto.UserJoinRequestBody;
import com.example.springsecurity.user.domain.dto.UserLoginRequestBody;
import com.example.springsecurity.user.service.UserJoinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserAPI {
    private final UserJoinService userJoinService;

    @PostMapping("/login")
    public ResponseEntity userPostLogin(@RequestBody UserLoginRequestBody req) {
        return ResponseEntity.ok("login");
    }

    @PostMapping("/join")
    public ResponseEntity userPostJoin(@RequestBody UserJoinRequestBody req) {
        try {
            userJoinService.userJoin(req);
            return ResponseEntity.ok("join");
        } catch (RuntimeException runtimeException) {
            System.out.println(runtimeException.getMessage());
            return ResponseEntity.badRequest().body(runtimeException.getMessage());
        }
    }

    @GetMapping("/join")
    public ResponseEntity userGetJoin(@RequestBody UserJoinRequestBody req) {
        System.out.println(req.getUserEmail());
        return ResponseEntity.ok("join");
    }
}
