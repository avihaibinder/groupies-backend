package com.groupies.groupies.user.payload.request;

import lombok.Getter;

@Getter
public class LoginRequest {
    private String email;
    private String password;
}
