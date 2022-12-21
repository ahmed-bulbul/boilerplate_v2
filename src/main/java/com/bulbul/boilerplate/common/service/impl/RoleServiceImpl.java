package com.bulbul.boilerplate.common.service.impl;

import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.common.generic.service.AbstractSearchService;
import com.bulbul.boilerplate.common.generic.specification.CustomSpecification;
import com.bulbul.boilerplate.common.payload.request.RoleDto;
import com.bulbul.boilerplate.common.payload.search.RoleSearchDto;
import com.bulbul.boilerplate.common.service.RoleService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends AbstractSearchService<Role, RoleDto, RoleSearchDto> implements RoleService {

    private static final String NAME = "name";
    private static final String DESCRIPTION = "description";

    public RoleServiceImpl(AbstractRepository<Role> repository) {
        super(repository);
    }

    @Override
    protected Specification<Role> buildSpecification(RoleSearchDto searchDto) {
        CustomSpecification<Role> customSpecification = new CustomSpecification<>();
        return Specification.where(customSpecification.likeSpecificationAtRoot(searchDto.getName().name(), NAME )
                .and(customSpecification.equalSpecificationAtRoot(searchDto.getDescription(),DESCRIPTION))
        );
    }

    @Override
    protected <T> T convertToResponseDto(Role role) {
        return null;
    }

    @Override
    protected Role convertToEntity(RoleDto roleDto) {
        return null;
    }

    @Override
    protected Role updateEntity(RoleDto dto, Role entity) {
        return null;
    }
}
