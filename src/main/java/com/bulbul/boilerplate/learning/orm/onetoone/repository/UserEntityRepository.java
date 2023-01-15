package com.bulbul.boilerplate.learning.orm.onetoone.repository;

import com.bulbul.boilerplate.learning.orm.onetoone.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity,Long> {
}
