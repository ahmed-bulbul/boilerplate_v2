package com.bulbul.boilerplate.common.payload.search;

import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RoleSearchDto  implements SDto {

    private ERole name;
    private String description;
}
