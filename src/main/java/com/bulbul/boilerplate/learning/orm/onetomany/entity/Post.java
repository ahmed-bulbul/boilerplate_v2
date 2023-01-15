package com.bulbul.boilerplate.learning.orm.onetomany.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "posts")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String title;
    String description;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "post_id", referencedColumnName = "id")
    Set<Comment> comments = new HashSet<>();

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Post)) return false;
        return Objects.nonNull(this.getId()) && Objects.equals(this.getId(), (((Post) object).getId()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
