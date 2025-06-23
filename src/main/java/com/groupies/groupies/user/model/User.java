package com.groupies.groupies.user.model;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "USERS")
@Getter
public class User implements UserDetails {
    @Id
    @GeneratedValue()
    private Long id;

    @Column(unique = true, nullable = false, updatable = false)
    String email;

    @Column(nullable = false)
    String password;

    @Column(name = "verification_code")
    private String verificationCode;

    @Column(name = "verification_expiration_date")
    private LocalDateTime verificationExpirationDate;

    private boolean isEnabled;

    public User(String email, String password, String verificationCode, LocalDateTime verificationExpirationDate, boolean isEnabled) {
        this.email = email;
        this.password = password;
        this.verificationCode = verificationCode;
        this.verificationExpirationDate = verificationExpirationDate;
        this.isEnabled = isEnabled;
    }

    private User() {
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
