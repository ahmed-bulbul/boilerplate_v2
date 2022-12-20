package com.bulbul.boilerplate.common.generic.controller;



import com.bulbul.boilerplate.common.generic.entity.AbstractEntity;
import com.bulbul.boilerplate.common.generic.payload.marker.IDto;
import com.bulbul.boilerplate.common.generic.payload.response.MessageResponse;
import com.bulbul.boilerplate.common.generic.payload.response.PageData;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

public interface IController<E extends AbstractEntity, D extends IDto> {
    PageData getAll(Boolean isActive, Pageable pageable);

    <T> T getSingle(Long id);

    ResponseEntity<MessageResponse> create(D d);

    ResponseEntity<MessageResponse> update(D d, Long id);

    ResponseEntity<MessageResponse> updateActiveStatus(Long id, Boolean isActive);
}
