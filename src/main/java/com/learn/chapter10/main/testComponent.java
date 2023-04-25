package com.learn.chapter10.main;

import com.learn.chapter10.pojo.Role;
import com.learn.chapter10.pojo.RoleController;
import com.learn.chapter10.pojo.RoleServiceImpl;
import com.learn.chapter10.pojo.RoleServiceImpl2;
import com.learn.chapter10.service.ApplicationConfig;
import com.learn.chapter10.service.RoleService;
import com.learn.chapter10.service.RoleService2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class testComponent {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        Role role = context.getBean(Role.class);
//        RoleService roleService = (RoleService) context.getBean("roleServiceImpl");
//        roleService.printRoleInfo(role);
//        RoleService2 roleService2 = context.getBean(RoleService2.class);
//        roleService2.printRoleInfo();
        Role role = context.getBean(Role.class);
        RoleController roleController = context.getBean(RoleController.class);
        roleController.printRole(role);


    }
}
