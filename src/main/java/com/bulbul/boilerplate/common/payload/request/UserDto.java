package com.bulbul.boilerplate.common.payload.request;

import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements IDto {
    private String login;
}
