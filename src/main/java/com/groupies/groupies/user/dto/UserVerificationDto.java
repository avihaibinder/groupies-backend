package com.groupies.groupies.user.dto;

import lombok.Getter;

@Getter
public class UserVerificationDto {
    private String email;
    private String verificationCode;
}
