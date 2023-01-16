package com.bulbul.boilerplate.configurationmanagement.repository.administration;


import com.bulbul.boilerplate.configurationmanagement.entity.ConfigSubmoduleItem;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface ConfigSubmoduleItemRepository extends JpaRepository<ConfigSubmoduleItem,Long> {
    List<ConfigSubmoduleItem> findBySubModuleIdAndItemNameIgnoreCase(Long submoduleId, String itemName);
    boolean existsBySubModuleIdAndIsActiveTrue(Long submoduleId);
    boolean existsByBaseItemAndIsActiveTrue(Long baseItem);

    Optional<ConfigSubmoduleItem> findByIdAndIsActiveTrue(Long id);

    List<ConfigSubmoduleItem> findAllByIdIn(Set<Long> ids);

    Page<ConfigSubmoduleItem> findAll(Specification<ConfigSubmoduleItem> customSpecification, Pageable pageable);
}
