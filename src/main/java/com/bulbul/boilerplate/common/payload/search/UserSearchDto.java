package com.bulbul.boilerplate.common.payload.search;

import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSearchDto implements SDto {
    private String login;
}
