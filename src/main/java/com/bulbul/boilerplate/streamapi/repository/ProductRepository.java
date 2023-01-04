package com.bulbul.boilerplate.streamapi.repository;

import com.bulbul.boilerplate.streamapi.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
