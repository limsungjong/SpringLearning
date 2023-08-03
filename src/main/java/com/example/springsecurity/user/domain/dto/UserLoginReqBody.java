package com.example.springsecurity.user.domain.dto;

import lombok.Getter;

@Getter
public class UserLoginReqBody {

    private String userEmail;

    private String userPassword;
}
