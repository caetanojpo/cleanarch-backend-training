package com.challenge.picpay.domain.expections;

import java.util.UUID;

public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
    public EntityNotFoundException(String objectName, UUID id) {
        super(objectName + " not found by ID: " + id);
    }
}
