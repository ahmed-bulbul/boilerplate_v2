package com.bulbul.boilerplate.configurationmanagement.dto.search;


import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collections;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class WorkFlowActionSearchDto implements SDto {
    private String query;
    private Boolean isActive = true;
    private Long subModuleItemId;
    @JsonIgnore
    Set<Long> workFlowActionIds = Collections.emptySet();
}
