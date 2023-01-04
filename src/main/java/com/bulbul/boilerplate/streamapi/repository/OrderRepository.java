package com.bulbul.boilerplate.streamapi.repository;

import com.bulbul.boilerplate.streamapi.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
