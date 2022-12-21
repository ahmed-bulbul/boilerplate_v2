package com.bulbul.boilerplate.common.entity;


import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
public class Role extends AbstractDomainBasedEntity {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
    private String description;


}
