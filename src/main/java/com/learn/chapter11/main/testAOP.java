package com.learn.chapter11.main;

import com.learn.chapter11.aopService.AopConfig;
import com.learn.chapter11.aopService.RoleService;
import com.learn.chapter11.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testAOP {
    public static void main(String[] args) {
//        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-cfg.xml");
//        RoleService roleService = (RoleService) ctx.getBean(RoleService.class);
        RoleService roleService = (RoleService) ctx.getBean("roleService11");
        Role role = new Role();
        role.setId(1L);
        role.setRoleName("role_name_1");
        role.setNote("note_1");
        System.out.println(">".repeat(20));
        roleService.printRoleInfo(role);
        System.out.println(">".repeat(20));
        // 测试异常
//        role = null;
//        roleService.printRoleInfo(role);
    }
}
