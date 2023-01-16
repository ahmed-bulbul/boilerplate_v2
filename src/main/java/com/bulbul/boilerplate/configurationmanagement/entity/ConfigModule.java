package com.bulbul.boilerplate.configurationmanagement.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "config_modules")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigModule {
    @Id
    @Column(name = "id")
    private Long id;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "is_active", columnDefinition="bit default 1", nullable = false)
    private Boolean isActive = true;
    @Column(name = "module_name", unique = true)
    private String moduleName;
    private String image;
    @Column(name = "module_order", nullable = false)
    private Integer order;
    @OneToMany(mappedBy = "module", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ConfigSubModule> subModuleList;

    public static ConfigModule withId(long id) {
        ConfigModule configModule = new ConfigModule();
        configModule.setId(id);
        return configModule;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ConfigModule)) return false;
        return this.getId() != 0 && this.getId().equals(((ConfigModule) object).getId());
    }

    @Override
    public int hashCode() {
        if (Objects.isNull(this.getId())) {
            return this.getClass().hashCode();
        }
        return this.getId().hashCode();
    }
}
