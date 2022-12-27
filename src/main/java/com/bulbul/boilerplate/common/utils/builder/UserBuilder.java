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
        User user = new User();
        user.setUsername(BuilderConstant.USERNAME);
        user.setPassword(passwordEncoder.encode(BuilderConstant.DEFAULT_PASSWORD));
        user.setEmail(BuilderConstant.USER_EMAIL);
        user.setRoles(
                getRoles().stream()
                        .filter(role-> role.getName().equals(ApplicationConstant.ROLE_USER))
                        .collect(Collectors.toSet())
        );
        userRepository.save(user);

    }
}
