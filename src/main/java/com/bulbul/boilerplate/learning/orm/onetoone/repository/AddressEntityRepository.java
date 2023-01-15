package com.bulbul.boilerplate.learning.orm.onetoone.repository;

import com.bulbul.boilerplate.learning.orm.onetoone.entity.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressEntityRepository extends JpaRepository<AddressEntity,Long> {
}
