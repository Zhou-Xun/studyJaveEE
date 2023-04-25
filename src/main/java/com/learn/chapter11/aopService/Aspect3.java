package com.learn.chapter11.aopService;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class Aspect3 {

    @Pointcut("execution(* com.learn.chapter11.aopService.MultiBeanImpl.testMulti(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before 3 .....");
    }

    @After("print()")
    public void after() {
        System.out.println("after 3 .....");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterRunning 3 .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 3 .....");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around 3 before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around 3 after ....");
    }
}
