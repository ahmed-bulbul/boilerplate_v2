package com.bulbul.boilerplate.common.controller;


import com.bulbul.boilerplate.common.entity.Role;
import com.bulbul.boilerplate.common.generic.controller.AbstractSearchController;
import com.bulbul.boilerplate.common.generic.service.ISearchService;
import com.bulbul.boilerplate.common.payload.request.RoleDto;
import com.bulbul.boilerplate.common.payload.search.RoleSearchDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/role")
public class RoleController extends AbstractSearchController<Role, RoleDto, RoleSearchDto> {


    public RoleController(ISearchService<Role, RoleDto, RoleSearchDto> iSearchService) {
        super(iSearchService);
    }
}
