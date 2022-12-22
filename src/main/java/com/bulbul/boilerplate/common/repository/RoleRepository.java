package com.bulbul.boilerplate.common.repository;

import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends AbstractRepository<Role> {
    Role findByName(ERole name);

    boolean existsByName(ERole name);
}
