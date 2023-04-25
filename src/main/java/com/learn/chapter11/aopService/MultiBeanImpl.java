package com.learn.chapter11.aopService;

import org.springframework.stereotype.Component;

@Component
public class MultiBeanImpl implements MultiBean{

    @Override
    public void testMulti() {
        System.out.println("test multi aspects!");
    }
}
