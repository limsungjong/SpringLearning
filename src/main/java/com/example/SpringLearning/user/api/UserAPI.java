package com.example.SpringLearning.user.api;

import com.example.SpringLearning.user.domain.dto.UserJoinRequestBody;
import com.example.SpringLearning.user.domain.dto.UserLoginRequestBody;
import com.example.SpringLearning.user.service.UserJoinService;
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

    @GetMapping("/join")
    public ResponseEntity userGetLogin(@RequestBody UserJoinRequestBody req) {

        return ResponseEntity.ok("ok");
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
}
