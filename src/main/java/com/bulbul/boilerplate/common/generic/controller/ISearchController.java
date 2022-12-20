package com.bulbul.boilerplate.common.generic.controller;


import com.bulbul.boilerplate.common.generic.entity.AbstractEntity;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import com.bulbul.boilerplate.common.generic.payload.marker.SDto;
import com.bulbul.boilerplate.common.generic.payload.response.PageData;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface ISearchController<E extends AbstractEntity, D extends IDto, S extends SDto> extends IController<E, D> {
    ResponseEntity<PageData> search(S s, Pageable pageable);
}
