package com.bulbul.boilerplate.configurationmanagement.repository.administration;


import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.configurationmanagement.entity.adminstration.ApprovalSetting;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ApprovalSettingRepository extends AbstractRepository<ApprovalSetting> {

    Optional<ApprovalSetting> findByWorkFlowActionIdAndSubModuleItemIdAndIsActiveTrue(Long workFlowAction, Long SubModuleId);

    List<ApprovalSetting> findBySubModuleItemIdAndIsActiveTrue(Long subModuleItemId);
}
