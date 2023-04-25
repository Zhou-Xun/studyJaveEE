package com.learn.chapter10.pojo;

public class Source {
    private String fruit; // 类型
    private String sugar; // 糖分描述
    private Integer size; // 大小杯

    @Override
    public String toString() {
        return "Source{" +
                "fruit='" + fruit + '\'' +
                ", sugar='" + sugar + '\'' +
                ", size=" + size +
                '}';
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getSugar() {
        return sugar;
    }

    public void setSugar(String sugar) {
        this.sugar = sugar;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
