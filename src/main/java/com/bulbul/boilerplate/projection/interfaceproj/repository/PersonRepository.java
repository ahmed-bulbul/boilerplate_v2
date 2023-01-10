package com.bulbul.boilerplate.projection.interfaceproj.repository;

import com.bulbul.boilerplate.projection.interfaceproj.entity.Person;
import com.bulbul.boilerplate.projection.interfaceproj.projection.PersonProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    PersonProjection findByAddressId(Long id);
    Person findPersonByFirstName(String firstName);
}
