package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;

import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalSettingResponseDto implements IDto {
    private Long id;
    private String workFlowActionName;
    private Long workFlowActionId;
    private Long subModuleItemId;
    private String subModuleItemName;
}

