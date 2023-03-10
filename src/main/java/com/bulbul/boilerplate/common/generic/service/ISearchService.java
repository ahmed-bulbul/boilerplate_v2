package com.bulbul.boilerplate.common.generic.service;


import com.bulbul.boilerplate.common.generic.entity.AbstractEntity;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import com.bulbul.boilerplate.common.generic.payload.response.PageData;
import org.springframework.data.domain.Pageable;

public interface ISearchService<E extends AbstractEntity, D extends IDto, S extends SDto> extends IService<E, D> {
    PageData search(S s, Pageable pageable);
}
