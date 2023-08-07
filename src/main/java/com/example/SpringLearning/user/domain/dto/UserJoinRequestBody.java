package com.example.SpringLearning.user.domain.dto;

import lombok.Getter;

@Getter
public class UserJoinRequestBody {
    private String userName;
    private String userPassword;
    private String userEmail;
}
