package com.bulbul.boilerplate.common.utils.builder;


import com.bulbul.boilerplate.common.constant.ApplicationConstant;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.entity.User;
import com.bulbul.boilerplate.common.repository.RoleRepository;
import com.bulbul.boilerplate.common.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.stream.Collectors;

import static com.bulbul.boilerplate.common.utils.builder.BuilderConstant.*;

/**
 * UserBuilder
 * @author bulbulahmed
 * */

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

    public List<Role> getRoles(){
        return roleRepository.findAll();
    }

    //create user
    public void createUser(){
        create(USER_USERNAME, USER_EMAIL);
        create(ADMIN_USERNAME, ADMIN_EMAIL);
    }

    private void create(String username, String email) {
        if(Boolean.FALSE.equals(userRepository.existsByUsername(username))){
            User user = new User();
            user.setUsername(username);
            user.setPassword(passwordEncoder.encode(DEFAULT_PASSWORD));
            user.setEmail(email);
            user.setRoles(
                    getRoles().stream()
                            .filter(UserBuilder::isRoleUser)
                            .collect(Collectors.toSet())
            );
            userRepository.save(user);
        }
    }


    private static boolean isRoleUser(Role role) {
        return role.getName().toString().equals(ApplicationConstant.ROLE_USER);
    }
}
