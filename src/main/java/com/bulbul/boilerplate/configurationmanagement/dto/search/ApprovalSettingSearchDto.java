package com.bulbul.boilerplate.configurationmanagement.dto.search;


import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalSettingSearchDto implements SDto {
    private String workFlowActionName;
    private String subModuleItemName;
    private Boolean isActive = true;
}
