package com.challenge.picpay.domain.entities;

import com.challenge.picpay.domain.enums.UserRole;

import java.util.UUID;

public class User {
    private UUID id;
    private String fullName;
    private String cpf;
    private String email;
    private String hashedPassword;
    private UserRole role;

    public User(UUID id, String fullName, String cpf, String email, String hashedPassword, UserRole role) {
        this.id = id;
        this.fullName = fullName;
        this.cpf = cpf;
        this.email = email;
        this.hashedPassword = hashedPassword;
        this.role = role;
    }

    public User() {
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHashedPassword() {
        return hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }
}
