package com.bulbul.boilerplate.common.utils.builder;


import com.bulbul.boilerplate.common.constant.ApplicationConstant;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.repository.RoleRepository;
import com.bulbul.boilerplate.common.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UserBuilder {


    /**
     * Autowired Constructor
     *
     */

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;

    public UserBuilder(UserRepository userRepository, RoleRepository roleRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Set<Role> getRoles(){
        return roleRepository
    }

    //create user
    public void createUser(){
        User user = new User();
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("123456"));
        user.setEmail("user@user.com");
//        user.setRoles(
//                getRoles().get(0)
//        );

    }
}
