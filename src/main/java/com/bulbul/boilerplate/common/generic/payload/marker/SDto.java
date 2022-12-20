package com.bulbul.boilerplate.common.generic.payload.marker;


import com.bulbul.boilerplate.common.constant.ApplicationConstant;

/**
 * Marker interface for search dto.
 *
 * @author Masud Rana
 */
public interface SDto {
    default Boolean getIsActive() {
        return ApplicationConstant.STATUS_TRUE;
    }
}
