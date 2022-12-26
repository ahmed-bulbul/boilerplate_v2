package com.bulbul.boilerplate.common.utils.builder;


import com.bulbul.boilerplate.common.repository.UserRepository;
import org.springframework.stereotype.Component;

@Component
public class UserBuilder {


    /**
     * Autowired Constructor
     *
     */

    private final UserRepository userRepository;

    public UserBuilder(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    //create
}
