package com.bulbul.boilerplate.common.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * access right entity
 *
 * @author Bulbul Ahmed
 */
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "access_rights")
public class AccessRight {
    @Id
    private Integer id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "action_id", nullable = false)
    private Action action;

//    @ManyToOne(optional = false)
//    @JoinColumn(name = "submodule_item_id", nullable = false)
//    private ConfigSubmoduleItem configSubmoduleItem;

    @JsonIgnore
    @ManyToMany(mappedBy = "accessRightSet", fetch = FetchType.LAZY)
    private Set<Role> roleSet;

    public void addRole(Role role) {
        if (roleSet == null) {
            roleSet = new HashSet<>();
        }
        if (!roleSet.contains(role)) {
            roleSet.add(role);
            role.addAccessRight(this);
        }
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof AccessRight)) return false;
        return this.getId() != 0 && this.getId().equals(((AccessRight) object).getId());
    }

    @Override
    public int hashCode() {
        if (Objects.isNull(this.getId())) {
            return this.getClass().hashCode();
        }
        return this.getId().hashCode();
    }
}
