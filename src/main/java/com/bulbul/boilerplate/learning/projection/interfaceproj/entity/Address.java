package com.bulbul.boilerplate.learning.projection.interfaceproj.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id")
    private Person person;

    @Column(name = "person_id", insertable = false, updatable = false)
    private Long personId;

    private String state;

    private String city;

    private String street;

    private String zipCode;

}
