package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;


import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalSettingDto implements IDto {

    private Long id;
    @NotNull(message = ErrorId.WORK_FLOW_ACTION_NOT_FOUND)
    private Long workFlowActionId;
    @NotNull(message = ErrorId.SUB_MODULE_ID_REQUIRED)
    private Long subModuleItemId;
    @NotEmpty(message = ErrorId.EMPLOYEE_ID_REQUIRED)
    private Set<Long> employeeIds;
}
