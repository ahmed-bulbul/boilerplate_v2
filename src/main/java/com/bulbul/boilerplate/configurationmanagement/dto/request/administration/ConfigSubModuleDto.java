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
public class ConfigSubModuleDto implements IDto {
    private Long id;
    @NotNull(message = ErrorId.MODULE_ID_REQUIRED)
    private Long moduleId;
    @NotBlank(message = ErrorId.SUB_MODULE_NAME_REQUIRED)
    private String submoduleName;
    @NotNull(message = ErrorId.SUBMODULE_ORDER_MUST_NOT_BE_EMPTY)
    private int order;
    private Boolean isActive;
}
