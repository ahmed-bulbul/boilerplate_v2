package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;


import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkFLowActionRequestDto implements IDto {
    @NotBlank
    private String name;
    @NotNull(message = ErrorId.ACTION_FLOW_ORDER_NUMBER_IS_NULL)
    @Min(1)
    private Integer orderNumber;
    private String label;
}
