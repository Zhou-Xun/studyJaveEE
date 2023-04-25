package com.learn.chapter10.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("elBean")
public class ELBean {

    // 通过beanName获取bean，注入
    @Value("#{role_annotation}")
    private Role role;

    // 获取bean的属性id
    @Value("#{role_annotation.id}")
    private Long id;

    // 调用bean的getNote方法, 获取角色名称
    @Value("#{role_annotation.getNote()?.toString()}")
    private String note;

    @Value("#{T(java.lang.Math).PI}")
    private double pi;

    @Value("#{T(Math).random()}")
    private double random;

    @Value("#{role_annotation.id+1}")
    private int num;

    @Value("#{role_annotation.roleName + role_annotation.note}")
    private String concatStr;

    @Value("#{role_annotation.id == 9999}")
    private boolean equalNum;

    @Value("#{role_annotation.note eq 'test_note_99999'}")
    private boolean equalString;

    @Value("#{role_annotation.id > 2}")
    private boolean greater;

    @Value("#{role_annotation.id < 2}")
    private boolean less;

    public boolean isEqualNum() {
        return equalNum;
    }

    public void setEqualNum(boolean equalNum) {
        this.equalNum = equalNum;
    }

    public boolean isEqualString() {
        return equalString;
    }

    public void setEqualString(boolean equalString) {
        this.equalString = equalString;
    }

    public boolean isGreater() {
        return greater;
    }

    public void setGreater(boolean greater) {
        this.greater = greater;
    }

    public boolean isLess() {
        return less;
    }

    public void setLess(boolean less) {
        this.less = less;
    }

    public String getConcatStr() {
        return concatStr;
    }

    public void setConcatStr(String concatStr) {
        this.concatStr = concatStr;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Role getRole() {
        return role;
    }

    public double getPi() {
        return pi;
    }

    public void setPi(double pi) {
        this.pi = pi;
    }

    public double getRandom() {
        return random;
    }

    public void setRandom(double random) {
        this.random = random;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
