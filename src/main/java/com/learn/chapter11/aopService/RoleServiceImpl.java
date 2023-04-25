package com.learn.chapter11.aopService;

import com.learn.chapter11.pojo.Role;
import com.learn.chapter11.aopService.RoleService;
import org.springframework.stereotype.Component;

@Component("roleService_aop")
public class RoleServiceImpl implements RoleService {

    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id = " + role.getId());
        System.out.println("roleName = " + role.getRoleName());
        System.out.println("roleNote = " + role.getNote());
    }

    public void testArg(Role role, int sort) {
        System.out.println("testArg ....");
    }
}
