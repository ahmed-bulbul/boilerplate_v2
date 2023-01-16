package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalSettingCustomResponseDto {
    //private List<CustomUserResponseDto> selectedUsers = new ArrayList<>();
    private Long workFlowActionId;
    private String workFlowActionName;
    private String subModuleItemName;
    private Long subModuleItemId;
    public static ApprovalSettingCustomResponseDto emptyResponse() {
        return new ApprovalSettingCustomResponseDto();
    }
}
