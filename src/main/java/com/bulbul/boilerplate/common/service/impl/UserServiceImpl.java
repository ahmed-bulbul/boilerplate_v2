package com.bulbul.boilerplate.common.service.impl;


import com.bulbul.boilerplate.common.constant.ApplicationConstant;
import com.bulbul.boilerplate.common.constant.ErrorId;
import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.exception.ApplicationServerException;
import com.bulbul.boilerplate.common.generic.repository.AbstractRepository;
import com.bulbul.boilerplate.common.generic.service.AbstractSearchService;
import com.bulbul.boilerplate.common.payload.request.UserDto;
import com.bulbul.boilerplate.common.payload.search.UserSearchDto;
import com.bulbul.boilerplate.common.repository.UserRepository;
import com.bulbul.boilerplate.common.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.MDC;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends AbstractSearchService<User, UserDto, UserSearchDto> implements UserService {

    private final UserRepository userRepository;
    public UserServiceImpl(AbstractRepository<User> repository, UserRepository userRepository) {
        super(repository);
        this.userRepository = userRepository;
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

    @Override
    public User findByUsername(String username) {
        if (StringUtils.isBlank(username)) {
            throw new ApplicationServerException(
                    ErrorId.ID_IS_REQUIRED,
                    HttpStatus.BAD_REQUEST,
                    MDC.get(ApplicationConstant.TRACE_ID));
        }
        return userRepository.findByUsername(username).orElseThrow(() -> {
            throw new ApplicationServerException(
                    ErrorId.USER_NOT_EXISTS,
                    HttpStatus.NOT_FOUND,
                    MDC.get(ApplicationConstant.TRACE_ID));
        });
    }
}

