package com.groupies.groupies.user.payload.response;

import lombok.Getter;

@Getter
public class LoginResponse {
    private String token;
    private long expirationTimestamp;

    public LoginResponse(String token, long expirationTimestamp) {
        this.token = token;
        this.expirationTimestamp = expirationTimestamp;
    }
}
