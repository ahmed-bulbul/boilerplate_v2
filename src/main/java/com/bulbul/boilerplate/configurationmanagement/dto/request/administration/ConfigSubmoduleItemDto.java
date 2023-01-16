package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;


import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigSubmoduleItemDto implements IDto {
    private Long id;
    @NotNull(message = ErrorId.SUB_MODULE_ID_REQUIRED)
    private Long subModuleId;
    @NotBlank(message = ErrorId.ITEM_NAME_REQUIRED)
    private String itemName;
    private String urlPath;
    @NotNull(message = ErrorId.SUBMODULE_ITEM_ORDER_MUST_NOT_BE_EMPTY)
    private int order;
    private Boolean isBase;
    private Long baseItem;
    private Boolean isActive;
}
