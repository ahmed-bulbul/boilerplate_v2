package com.bulbul.boilerplate.configurationmanagement.repository.administration;

import com.bulbul.boilerplate.configurationmanagement.entity.ConfigModule;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ConfigModuleRepository extends JpaRepository<ConfigModule,Long> {
    List<ConfigModule> findByModuleNameIgnoreCase(String moduleName);
    List<ConfigModule> findAllByIsActiveTrue();

    Optional<ConfigModule> findByIdAndIsActiveTrue(Long id);

    Page<ConfigModule> findAll(Specification<ConfigModule> customSpecification, Pageable pageable);
}
