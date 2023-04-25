package com.learn.chapter11.aopService;

import com.learn.chapter11.pojo.Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class RoleAspect {

    @Pointcut("execution(* com.learn.chapter11.aopService.RoleServiceImpl.printRoleInfo(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before .....");
    }

    @Before("execution(* " +
            "com.learn.chapter11.aopService.RoleServiceImpl.testArg(..)) " +
            "&& args(role, sort)")
    public void testBefore(Role role, int sort) {
        System.out.println("before sort: " + sort);
    }

    @After("print()")
    public void after() {
        System.out.println("after .....");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterRunning .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing .....");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around after ....");
    }
}
