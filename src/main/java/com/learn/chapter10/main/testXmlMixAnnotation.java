package com.learn.chapter10.main;

import com.learn.chapter10.pojo.ELBean;
import com.learn.chapter10.pojo.JuiceMaker;
import com.learn.chapter10.pojo.Role;
import com.learn.chapter10.service.ApplicationConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testXmlMixAnnotation {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
//        JuiceMaker juiceMaker = (JuiceMaker) context.getBean("juiceMaker");
//        System.out.println(juiceMaker);
//        Role role1 = (Role) context.getBean("role_annotation");
//        Role role2 = (Role) context.getBean("role_annotation");
//        System.out.println(role1==role2);
        ELBean elBean = (ELBean) context.getBean("elBean");
        System.out.println(elBean.getNote());
        System.out.println(elBean.getPi());
        System.out.println(elBean.getNum());
        System.out.println(elBean.getConcatStr());
    }
}
