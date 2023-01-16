package com.bulbul.boilerplate.configurationmanagement.dto.response.adminstration;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WorkFLowActionResponseDto {
    private Long id;
    private String name;
    private Integer orderNumber;
    private boolean editable;
    private boolean actionable;
    private String label;
}
