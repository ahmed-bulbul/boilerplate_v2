package com.bulbul.boilerplate.projection.interfaceproj.repository;

import com.bulbul.boilerplate.projection.interfaceproj.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
