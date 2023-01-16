package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigSubmoduleItemResponseDto {
    private Long id;
    private Long subModuleId;
    private String subModuleName;
    private Long moduleId;
    private String moduleName;
    private String itemName;
    private String itemNameHrf;
    private String urlPath;
    private int order;
    private Boolean isBase;
    private Long baseItem;
    private String baseItemName;
    private Boolean isActive;
}
