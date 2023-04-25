package com.learn.chapter11.aopService;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class Aspect1 {

    @Pointcut("execution(* com.learn.chapter11.aopService.MultiBeanImpl.testMulti(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before 1 .....");
    }

    @After("print()")
    public void after() {
        System.out.println("after 1 .....");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterRunning 1 .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 1 .....");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around 1 before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around 1 after ....");
    }
}
