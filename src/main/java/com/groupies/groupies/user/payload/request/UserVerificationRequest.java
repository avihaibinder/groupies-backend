package com.groupies.groupies.user.payload.request;

import lombok.Getter;

@Getter
public class UserVerificationRequest {
    private String email;
    private String verificationCode;
}
