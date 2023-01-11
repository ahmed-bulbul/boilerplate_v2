package com.bulbul.boilerplate.projection.interfaceproj.service;

import com.bulbul.boilerplate.common.exception.ApplicationServerException;
import com.bulbul.boilerplate.projection.interfaceproj.dto.PersonResponseDto;
import com.bulbul.boilerplate.projection.interfaceproj.entity.Person;
import com.bulbul.boilerplate.projection.interfaceproj.projection.PersonProjection;
import com.bulbul.boilerplate.projection.interfaceproj.repository.PersonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.Optional;

@Service
public class PersonService {
    
    private final PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public PersonResponseDto getById(Long id) {
        Optional<Person> person = personRepository.findById(id);
        if(person.isPresent()){
            return convertToResponseDto(person);
        }else{
            throw new ApplicationServerException("404", HttpStatus.NOT_FOUND,"404");
        }
    }

    private PersonResponseDto convertToResponseDto(Optional<Person> person) {
        PersonProjection personProjection = personRepository.findPersonsById(person.orElseThrow().getId());
        PersonResponseDto p = new PersonResponseDto();
        p.setId(person.get().getId());
        p.setFirstName(person.get().getFirstName());
        p.setLastName(person.get().getLastName());
        p.setCity(personProjection.getAddressCity());
        p.setZip(personProjection.getAddressZipCode());
        return p;
    }
}
