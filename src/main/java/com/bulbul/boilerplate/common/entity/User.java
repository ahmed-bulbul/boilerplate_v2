package com.bulbul.boilerplate.common.entity;


import com.bulbul.boilerplate.common.generic.entity.AbstractDomainBasedEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User extends AbstractDomainBasedEntity {

    @NotBlank
    @Size(max = 20)
    private String login;

    @NotBlank
    @Size(max = 120)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(	name = "user_roles",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

//    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//    private RefreshToken refreshToken;

//    @ManyToOne
//    @JoinColumn(name = "employee_id")
//    private Employee employee;
//
//    @Column(name = "employee_id", insertable = false, updatable = false)
//    private Long employeeId;


    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    @JsonIgnore
    public static User withId(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }
}
