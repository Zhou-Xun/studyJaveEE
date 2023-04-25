package com.learn.chapter12.main;

import com.learn.chapter12.pojo.Role;
import com.learn.chapter12.service.RoleListService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class testInsertChapter12 {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-mybatis-cfg.xml");
        RoleListService roleListService = ctx.getBean(RoleListService.class);
        List<Role> roles = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Role role = new Role();
            role.setRoleName("xun0423_roleName_" + i);
            role.setNote("xun0423_note_" + i);
            roles.add(role);
        }
        int count = roleListService.insertRoleList(roles);
        System.out.println(count);
    }
}
