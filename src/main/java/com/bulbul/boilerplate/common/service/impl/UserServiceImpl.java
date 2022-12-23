package com.bulbul.boilerplate.common.service.impl;


import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.common.generic.service.AbstractSearchService;
import com.bulbul.boilerplate.common.payload.request.UserDto;
import com.bulbul.boilerplate.common.payload.search.UserSearchDto;
import com.bulbul.boilerplate.common.service.UserService;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractSearchService<User, UserDto, UserSearchDto> implements UserService {

    public UserServiceImpl(AbstractRepository<User> repository) {
        super(repository);
    }

    @Override
    protected Specification<User> buildSpecification(UserSearchDto searchDto) {
        return null;
    }

    @Override
    protected <T> T convertToResponseDto(User user) {
        return null;
    }

    @Override
    protected User convertToEntity(UserDto userDto) {

        return null;
    }

    @Override
    protected User updateEntity(UserDto dto, User entity) {
        return null;
    }

    @Override
    public String testFunction() {
        return null;
    }
}

