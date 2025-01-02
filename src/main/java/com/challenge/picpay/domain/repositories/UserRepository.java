package com.challenge.picpay.domain.repositories;

import com.challenge.picpay.domain.entities.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    Optional<User> findById(final UUID id);

    List<User> findAll();

    User save(User user);
}
