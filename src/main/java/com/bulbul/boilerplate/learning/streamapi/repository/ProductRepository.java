package com.bulbul.boilerplate.learning.streamapi.repository;

import com.bulbul.boilerplate.learning.streamapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
