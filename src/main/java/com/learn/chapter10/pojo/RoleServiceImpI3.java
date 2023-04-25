package com.learn.chapter10.pojo;

import com.learn.chapter10.service.RoleService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("roleService3")
@Primary
public class RoleServiceImpI3 implements RoleService {
    @Override
    public void printRoleInfo(Role role) {
        System.out.println("id_3 = " + role.getId());
        System.out.println("roleName_3 = " + role.getRoleName());
        System.out.println("roleNote_3 = " + role.getNote());
    }
}
