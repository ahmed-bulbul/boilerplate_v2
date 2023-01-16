package com.bulbul.boilerplate.configurationmanagement.entity;

import com.bulbul.boilerplate.common.entity.AccessRight;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "config_sub_module_items")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfigSubmoduleItem {
    @Id
    private Long id;
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;
    @Column(name = "is_active", columnDefinition="bit default 1", nullable = false)
    private Boolean isActive = true;
    @ManyToOne
    @JoinColumn(name = "submodule_id", nullable = false)
    private ConfigSubModule subModule;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "url_path")
    private String urlPath;
    @Column(name = "submodule_item_order", nullable = false)
    private Integer order;
    @Column(name = "is_base")
    private Boolean isBase;
    @Column(name = "base_item")
    private Long baseItem;

    @JsonIgnore
    @OneToMany(mappedBy = "configSubmoduleItem", cascade = {CascadeType.MERGE, CascadeType.PERSIST},
            fetch = FetchType.LAZY)
    Set<AccessRight> accessRightSet;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof ConfigSubmoduleItem)) return false;
        return this.getId() != 0 && this.getId().equals(((ConfigSubmoduleItem) object).getId());
    }

    @Override
    public int hashCode() {
        if (Objects.isNull(this.getId())) {
            return this.getClass().hashCode();
        }
        return this.getId().hashCode();
    }

    public static ConfigSubmoduleItem withId(Long id) {
        ConfigSubmoduleItem item = new ConfigSubmoduleItem();
        item.setId(id);
        return item;
    }
}
