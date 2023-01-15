package com.bulbul.boilerplate.learning.projection.interfaceproj.repository;

import com.bulbul.boilerplate.learning.projection.interfaceproj.projection.PersonProjection;
import com.bulbul.boilerplate.learning.projection.interfaceproj.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,Long> {

    PersonProjection findPersonsById(Long id);
    Person findPersonByFirstName(String firstName);
}
