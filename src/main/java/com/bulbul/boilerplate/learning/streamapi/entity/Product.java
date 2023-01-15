package com.bulbul.boilerplate.learning.streamapi.entity;

import com.bulbul.boilerplate.common.entity.Role;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Objects;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String category;
    private Double price;

    @ManyToMany(mappedBy = "products")
    @ToString.Exclude
    private Set<Order> orders;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Role)) return false;
        return this.getId() != 0 && this.getId().equals(((Role) object).getId());
    }

    @Override
    public int hashCode() {
        if (Objects.isNull(this.getId())) {
            return this.getClass().hashCode();
        }
        return this.getId().hashCode();
    }

}