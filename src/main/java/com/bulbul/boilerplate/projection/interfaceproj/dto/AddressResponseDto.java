package com.bulbul.boilerplate.projection.interfaceproj.dto;

import com.bulbul.boilerplate.projection.interfaceproj.entity.Person;
import jakarta.persistence.Column;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddressResponseDto {

    private Long id;

    private String state;

    private String city;

    private String street;

    private String zipCode;
}
