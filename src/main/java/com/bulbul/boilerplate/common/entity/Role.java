package com.bulbul.boilerplate.common.entity;


import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "roles")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role extends AbstractDomainBasedEntity {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
    private String description;

    private Boolean isDeleted = false;
//    @JsonIgnore
//    @OneToMany(mappedBy = "role", cascade = {CascadeType.MERGE, CascadeType.PERSIST},
//            orphanRemoval = true, fetch = FetchType.LAZY)
//    private Set<User> userSet;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "role_accesses",
            joinColumns = {@JoinColumn(name = "role_id")},
            inverseJoinColumns = {@JoinColumn(name = "access_right_id")}
    )
    private Set<AccessRight> accessRightSet;

    public void addAccessRight(AccessRight accessRight) {
        if (accessRightSet == null) {
            accessRightSet = new HashSet<>();
        }
        if (!accessRightSet.contains(accessRight)) {
            accessRightSet.add(accessRight);
            accessRight.addRole(this);
        }
    }



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
