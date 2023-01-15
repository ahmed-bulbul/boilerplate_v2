package com.bulbul.boilerplate.learning.projection.interfaceproj.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PersonResponseDto {

    private Long id;

    private String firstName;

    private String lastName;

    private String city;

    private String zip;
}
