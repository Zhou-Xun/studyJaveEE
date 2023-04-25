package com.learn.chapter5.main;

import com.learn.chapter5.pojo.SexEnum;

public class test {
    public static void main(String[] args) {
        System.out.println(Enum.valueOf(SexEnum.class, "MALE"));
    }
}
