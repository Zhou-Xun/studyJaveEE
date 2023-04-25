package com.learn.chapter12.main;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.learn.chapter12")
@ImportResource({"classpath:spring-mybatis-cfg.xml"})
public class ApplicationConfig12 {

}
