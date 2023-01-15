package com.bulbul.boilerplate.learning.orm.onetoone.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users_entity")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_entity_id", referencedColumnName = "id")
    AddressEntity addressEntity;
}
