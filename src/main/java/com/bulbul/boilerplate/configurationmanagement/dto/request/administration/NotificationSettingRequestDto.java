package com.bulbul.boilerplate.configurationmanagement.dto.request.administration;

;
import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NotificationSettingRequestDto implements IDto {
    private Long workflowActionId;
    @NotNull(message = ErrorId.SUBMODULE_ITEM_ID_REQUIRED)
    private Long submoduleItemId;
    @NotEmpty(message = ErrorId.EMPLOYEE_ID_REQUIRED)
    private Set<Long> employeeIds;
}
