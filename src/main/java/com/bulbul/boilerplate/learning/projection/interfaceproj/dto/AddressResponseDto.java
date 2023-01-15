package com.bulbul.boilerplate.learning.projection.interfaceproj.dto;

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
