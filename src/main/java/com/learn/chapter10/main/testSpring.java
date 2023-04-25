package com.learn.chapter10.main;

import com.learn.chapter10.pojo.ComplexAssembly;
import com.learn.chapter10.pojo.JuiceMaker;
import com.learn.chapter10.pojo.Role;
import com.learn.chapter10.pojo.UserRoleAssembly;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("spring-cfg.xml");

        JuiceMaker juiceMaker = (JuiceMaker) context.getBean("juiceMaker");
        System.out.println(juiceMaker);

        Role role = (Role) context.getBean("role");
        System.out.println(role);

        Role roleSetter = (Role) context.getBean("roleSetter");
        System.out.println(roleSetter);

        ComplexAssembly complexAssembly = (ComplexAssembly) context.getBean("complexAssembly");
        System.out.println(complexAssembly);

        UserRoleAssembly userRoleAssembly = (UserRoleAssembly) context.getBean("userRoleAssembly");
        System.out.println(userRoleAssembly);

        UserRoleAssembly userRoleAssembly_p_1 = (UserRoleAssembly) context.getBean("userRoleAssembly_p_1");
        System.out.println(userRoleAssembly_p_1);
    }
}
