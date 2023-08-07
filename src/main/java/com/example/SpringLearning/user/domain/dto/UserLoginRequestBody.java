package com.example.SpringLearning.user.domain.dto;

import lombok.Getter;

@Getter
public class UserLoginRequestBody {
    private String userName;

    private String userPassword;
}
