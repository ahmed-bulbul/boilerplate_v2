package com.bulbul.boilerplate.common.repository;

import com.bulbul.boilerplate.common.entity.Action;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActionRepository extends JpaRepository<Action, Integer> {
}
