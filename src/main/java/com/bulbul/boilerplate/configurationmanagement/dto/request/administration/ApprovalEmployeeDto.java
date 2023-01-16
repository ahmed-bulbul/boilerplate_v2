package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;

import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ApprovalEmployeeDto implements IDto {

    private Long id;
    @NotNull(message = ErrorId.APPROVAL_ITEM_ID_REQUIRED)
    private Long ApprovalSettingId;
    @NotNull(message = ErrorId.EMPLOYEMEE_ID_REQUIRED)
    private Long employeeId;
}
