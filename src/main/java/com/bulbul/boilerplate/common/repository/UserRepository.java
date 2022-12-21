package com.bulbul.boilerplate.common.repository;

import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends AbstractRepository<User> {
}
