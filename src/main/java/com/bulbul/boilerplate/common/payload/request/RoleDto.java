package com.bulbul.boilerplate.common.payload.request;

import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleDto  implements IDto {

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private ERole name;
    private String description;
}
