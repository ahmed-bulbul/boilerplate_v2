package com.bulbul.boilerplate.streamapi.repository;

import com.bulbul.boilerplate.streamapi.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
}
