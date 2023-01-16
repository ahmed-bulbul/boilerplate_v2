package com.bulbul.boilerplate.configurationmanagement.dto.search;

import jakarta.validation.constraints.NotNull;
import lombok.Data;



@Data
public class SelectedUserSearchDto {
    @NotNull
    private Long workFlowActionId;
    private Boolean isActive = true;
    @NotNull
    private Long subModuleItemId;
    private Long designationId;
    private Long sectionId;
    private Long departmentId;
}
