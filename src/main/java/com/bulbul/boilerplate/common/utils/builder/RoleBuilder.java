package com.bulbul.boilerplate.common.utils.builder;

import com.bulbul.boilerplate.common.constant.ApplicationConstant;
import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.generic.service.ISearchService;
import com.bulbul.boilerplate.common.repository.RoleRepository;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;

/**
 * Role Builder
 * @author bulbulahmed
 * */

@Component
public class RoleBuilder {

    /**
     * Autowired Constructor
     *
     */

    private final RoleRepository roleRepository;

    public RoleBuilder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    /**
     * create system generated role when apps running for first time without data on database
     * */
    public void createRole(){

        List<Role> roleList = new ArrayList<>();
        //create SUPER_ADMIN
        Role roleSA = new Role();
        roleSA.setName(ERole.ROLE_SUPER_ADMIN);
        roleSA.setDescription(ApplicationConstant.ROLE_SUPER_ADMIN_DESCRIPTION);
        roleSA.setCreatedBy(ApplicationConstant.CREATED_BY_SYSTEM);
        roleList.add(roleSA);

        //create USER
        Role roleUSR= new Role();
        roleUSR.setName(ERole.ROLE_USER);
        roleUSR.setDescription(ApplicationConstant.ROLE_USER_DESCRIPTION);
        roleUSR.setCreatedBy(ApplicationConstant.CREATED_BY_SYSTEM);
        roleList.add(roleUSR);

        //save all
        if(!roleRepository.existsByName(roleSA.getName())
                && !roleRepository.existsByName(roleUSR.getName())){
            this.roleRepository.saveAll(roleList);
        }

    }
}
