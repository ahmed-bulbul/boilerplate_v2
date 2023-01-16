package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;

import com.bulbul.boilerplate.common.constant.ErrorId;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class ConfigModuleDto {
    private Long id;
    @NotBlank(message = ErrorId.MODULE_NAME_REQUIRED)
    private String moduleName;
    private String image;
    @NotNull(message = ErrorId.MODULE_ORDER_MUST_NOT_BE_EMPTY)
    private Integer order;
    private Boolean isActive;
}
