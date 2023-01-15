package com.bulbul.boilerplate.learning.streamapi.repository;

import com.bulbul.boilerplate.learning.streamapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
