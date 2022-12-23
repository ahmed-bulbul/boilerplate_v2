package com.bulbul.boilerplate.common.payload.response;


import com.bulbul.boilerplate.common.constant.ERole;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoleViewModel {
    private ERole name;
    private String description;
    private Boolean isActive;

}

