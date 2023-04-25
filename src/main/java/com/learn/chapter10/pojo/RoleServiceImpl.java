package com.learn.chapter10.pojo;

import com.learn.chapter10.service.RoleService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("roleService")
public class RoleServiceImpl implements RoleService {

    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("roleNote = " + role.getNote());
    }
}
