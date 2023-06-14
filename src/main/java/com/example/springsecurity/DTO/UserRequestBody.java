package com.example.springsecurity.DTO;

import lombok.Builder;

@Builder
public class UserRequestBody {
    private String userName;
    private String password;
}
