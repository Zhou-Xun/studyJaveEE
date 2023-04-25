package com.learn.chapter12.main;

import com.learn.chapter12.mapper.RoleMapper;
import com.learn.chapter12.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("spring-mybatis-cfg.xml");
        RoleMapper roleMapper = ctx.getBean(RoleMapper.class);
        Role role = roleMapper.getRole(100L);
        System.out.println(role);
    }
}
