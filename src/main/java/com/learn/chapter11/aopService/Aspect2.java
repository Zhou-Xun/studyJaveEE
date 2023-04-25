package com.learn.chapter11.aopService;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Aspect2 {

    @Pointcut("execution(* com.learn.chapter11.aopService.MultiBeanImpl.testMulti(..))")
    public void print() {
    }

    @Before("print()")
    public void before() {
        System.out.println("before 2 .....");
    }

    @After("print()")
    public void after() {
        System.out.println("after 2 .....");
    }

    @AfterReturning("print()")
    public void afterReturning() {
        System.out.println("afterRunning 2 .....");
    }

    @AfterThrowing("print()")
    public void afterThrowing() {
        System.out.println("afterThrowing 2 .....");
    }

    @Around("print()")
    public void around(ProceedingJoinPoint jp) {
        System.out.println("around 2 before ....");
        try {
            jp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around 2 after ....");
    }
}
