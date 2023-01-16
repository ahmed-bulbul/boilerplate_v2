package com.bulbul.boilerplate.configurationmanagement.repository.administration;


import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.configurationmanagement.dto.projection.WorkFlowActionProjection;
import com.bulbul.boilerplate.configurationmanagement.entity.adminstration.ApprovalEmployee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface ApprovalEmployeeRepository extends AbstractRepository<ApprovalEmployee> {

    Set<ApprovalEmployee> findAllByApprovalSettingIdAndEmployeeIdInAndIsActiveTrue(Long approvalSettingsId, Set<Long> employeeIds);

    Set<ApprovalEmployee> findAllByApprovalSettingIdAndIsActiveTrue(Long approvalSettingId);
    Set<ApprovalEmployee> findAllByApprovalSettingIdIn(Set<Long> approvalSettingIds);

    void deleteAllByApprovalSettingIdAndEmployeeIdIn(Long id,Set<Long> employeeIds);

    /*  Non Native query:
        @Query(value = "select a.workFlowActionId as actionId, a.workFlowAction.orderNumber as orderNumber from ApprovalSetting " +
            "as a inner join ApprovalEmployee as ae on a.id = ae.approvalSettingId" +
            " where a.subModuleItemId = :subModuleId AND ae.employeeId = :employeeId order by orderNumber asc")
    */
    @Query(value = "select actionId, orderNumber from (Select apprSet.id apprId, apprSet.workflow_action_id actionId," +
        " wf.order_no orderNumber from approval_settings apprSet inner join workflow_actions wf on wf.id = apprSet.workflow_action_id" +
        " where apprSet.submodule_item_id = :subModuleId) aso inner join (SELECT apprEmp.id apprEmpId, apprEmp.employee_id empId," +
        " apprEmp.approval_setting_id apsId from approval_employees apprEmp where apprEmp.employee_id = :employeeId) ae" +
        " on aso.apprId = ae.apsId order by orderNumber asc", nativeQuery = true)
    List<WorkFlowActionProjection> findApprovedActionsForUser(@Param(value = "subModuleId") Long subModuleId,
                                                              @Param(value = "employeeId") Long employeeId);
}
