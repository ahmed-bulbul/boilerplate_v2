package com.bulbul.boilerplate.learning.streamapi.repository;

import com.bulbul.boilerplate.learning.streamapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
