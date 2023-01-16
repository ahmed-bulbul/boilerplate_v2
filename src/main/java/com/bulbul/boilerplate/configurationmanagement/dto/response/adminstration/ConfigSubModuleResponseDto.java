package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigSubModuleResponseDto {
    private Long id;
    private String submoduleName;
    private Long moduleId;
    private String moduleName;
    private int order;
    private Boolean isActive;
}
