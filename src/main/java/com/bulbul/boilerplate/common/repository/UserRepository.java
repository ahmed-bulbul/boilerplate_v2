package com.bulbul.boilerplate.common.repository;

import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepository extends AbstractRepository<User> {
    Optional<User> findByUsername(String username);

    Boolean existsByUsername(String username);

    boolean existsByEmail(String email);
}
