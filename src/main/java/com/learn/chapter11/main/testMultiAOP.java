package com.learn.chapter11.main;

import com.learn.chapter11.aopService.AopConfig;
import com.learn.chapter11.aopService.MultiBean;
import com.learn.chapter11.aopService.RoleService;
import com.learn.chapter11.pojo.Role;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testMultiAOP {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
        MultiBean multiBean = ctx.getBean(MultiBean.class);
        multiBean.testMulti();
    }
}
