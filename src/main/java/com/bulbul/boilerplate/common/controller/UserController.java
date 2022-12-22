package com.bulbul.boilerplate.common.controller;


import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.generic.controller.AbstractSearchController;
import com.bulbul.boilerplate.common.generic.service.ISearchService;
import com.bulbul.boilerplate.common.payload.request.UserDto;
import com.bulbul.boilerplate.common.payload.search.UserSearchDto;
import com.bulbul.boilerplate.common.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * UserController
 * @author bulbulahmed
 * */

@RestController
@RequestMapping("/api/user")
public class UserController extends AbstractSearchController<User, UserDto, UserSearchDto> {

    /**
     * Autowired Constructor
     *
     * @param iSearchService {@link ISearchService}
     */

    private final UserService userService;

    public UserController(ISearchService<User, UserDto, UserSearchDto> iSearchService, UserService userService) {
        super(iSearchService);
        this.userService = userService;
    }
}
