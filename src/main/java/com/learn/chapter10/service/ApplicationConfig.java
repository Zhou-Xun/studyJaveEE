package com.learn.chapter10.service;

import com.learn.chapter10.pojo.Role;
import com.learn.chapter10.pojo.RoleServiceImpl;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@ComponentScan(basePackages = {"com.learn.chapter10.pojo","com.learn.chapter10.service"},
basePackageClasses = {Role.class, RoleServiceImpl.class})
@ImportResource({"classpath:spring-cfg.xml"})
public class ApplicationConfig {
}
