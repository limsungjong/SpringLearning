package com.example.springsecurity.user.domain.dto;

import lombok.Getter;

@Getter
public class UserJoinReqBody {
    private String userEmail;
    private String userPassword;
    private String userName;
}
