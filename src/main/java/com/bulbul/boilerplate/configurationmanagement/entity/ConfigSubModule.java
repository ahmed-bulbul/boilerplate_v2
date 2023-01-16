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
@Table(name = "config_sub_modules")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigSubModule {
    @Id
    private Long id;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "is_active", columnDefinition="bit default 1", nullable = false)
    private Boolean isActive = true;
    @ManyToOne
    @JoinColumn(name = "module_id")
    private ConfigModule module;
    @Column(name = "submodule_name")
    private String submoduleName;
    private String image;
    @Column(name = "submodule_order", nullable = false)
    private Integer order;
    @OneToMany(mappedBy = "subModule", cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.LAZY)
    @JsonIgnore
    private List<ConfigSubmoduleItem> submoduleItems;
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ConfigSubModule)) return false;
        return this.getId() != 0 && this.getId().equals(((ConfigSubModule) object).getId());
    }

    @Override
    public int hashCode() {
        if (Objects.isNull(this.getId())) {
            return this.getClass().hashCode();
        }
        return this.getId().hashCode();
    }
    public static ConfigSubModule withId(Long id) {
        ConfigSubModule configSubModule = new ConfigSubModule();
        configSubModule.setId(id);
        return configSubModule;
    }
}
