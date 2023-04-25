package com.learn.chapter10.pojo;

import com.learn.chapter10.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RoleController {

    @Autowired
    @Qualifier("roleService")
    private RoleService roleService = null;

    public void printRole(Role role) {
        roleService.printRoleInfo(role);
    }
}
