package com.learn.chapter11.aopService;

import com.learn.chapter11.pojo.Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;

public class XmlAspect {

    public void before(Role role) {
        System.out.println("XML role_id= "+ role.getId() + " before .....");
    }

    public void after() {
        System.out.println("xml after .....");
    }

    public void afterReturning() {
        System.out.println("xml afterRunning .....");
    }

    public void afterThrowing() {
        System.out.println("xml afterThrowing .....");
    }

    public void around(ProceedingJoinPoint jp) {
        System.out.println("xml round before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("xml around after ....");
    }
}
