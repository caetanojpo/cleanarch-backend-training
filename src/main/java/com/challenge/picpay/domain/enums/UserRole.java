package com.challenge.picpay.domain.enums;

public enum UserRole {
    COMMON("COMMON_USER"),
    SELLER("SELLER_USER"),
    ADMIN("ADMIN_USER");

    private final String value;

    UserRole(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
