package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationSettingResponseDto {
    private Long id;
    private String workflowActionName;
    private Long submoduleItemId;
}