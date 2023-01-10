package com.bulbul.boilerplate.projection.interfaceproj.controller;


import com.bulbul.boilerplate.projection.interfaceproj.dto.PersonResponseDto;
import com.bulbul.boilerplate.projection.interfaceproj.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/{id}")
    public PersonResponseDto getById(@PathVariable("id") Long id){
        return personService.getById(id);
    }
}
