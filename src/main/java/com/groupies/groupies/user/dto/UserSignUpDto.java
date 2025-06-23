package com.groupies.groupies.user.dto;

import lombok.Getter;

@Getter
public class UserSignUpDto {
    private String email;
    private String password;

    public UserSignUpDto(String email, String password) {
        this.email = email;
        this.password = password;
    }
}
