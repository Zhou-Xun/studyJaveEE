package com.learn.chapter10.pojo;

import com.learn.chapter10.service.RoleService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("RoleService2")
public class RoleServiceImpl2 implements RoleService2 {

    @Autowired(required = false)
    private Role role = null;

    private Role role2 = null;
    @Autowired
    public void setRole2(Role role2) {
        this.role2 = role2;
    }

    @Override
    public void printRoleInfo() {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("id = " + role.getId());
    }
}
