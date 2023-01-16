package com.bulbul.boilerplate.configurationmanagement.repository.administration;


import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.configurationmanagement.entity.adminstration.WorkFlowAction;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
public interface WorkFlowActionRepository extends AbstractRepository<WorkFlowAction> {

    List<WorkFlowAction> findByIsActiveTrueAndIdInOrShowFalse(Set<Long> workFlowActionIds);

    boolean existsByOrderNumberAndIsActiveTrueAndIdNot(Integer orderNumber, Long id);

    boolean existsByNameAndIsActiveTrueAndIdNot(String name, Long id);

    Optional<WorkFlowAction> findTop1ByShowFalseOrderByOrderNumberDesc();

    boolean existsByNameAndIsActiveTrue(String name);

    boolean existsByOrderNumberAndIsActiveTrue(Integer orderNumber);
}
