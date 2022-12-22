package com.bulbul.boilerplate.common.utils.builder;

import com.bulbul.boilerplate.common.constant.ERole;
import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.repository.RoleRepository;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;


@Component
public class RoleBuilder {

    private final RoleRepository roleRepository;

    public RoleBuilder(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    //create role
    public void createRole(){

        List<Role> roleList = new ArrayList<>();
        //create SUPER_ADMIN
        Role roleSA = new Role();
        roleSA.setName(ERole.ROLE_SUPER_ADMIN);
        roleSA.setDescription(BuilderConstant.ROLE_SUPER_ADMIN_DESC);
        roleSA.setCreatedBy(BuilderConstant.CREATED_BY_SYSTEM);
        roleList.add(roleSA);

        //create USER
        Role roleUSR= new Role();
        roleUSR.setName(ERole.ROLE_SUPER_ADMIN);
        roleUSR.setDescription(BuilderConstant.ROLE_USER_DESC);
        roleUSR.setCreatedBy(BuilderConstant.CREATED_BY_SYSTEM);
        roleList.add(roleUSR);

        //save all
        if(!roleRepository.existsByName(roleSA.getName())
                && !roleRepository.existsByName(roleUSR.getName())){
            this.roleRepository.saveAll(roleList);
        }

    }
}
