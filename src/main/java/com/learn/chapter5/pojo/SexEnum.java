package com.learn.chapter5.pojo;

public enum SexEnum {
    MALE(1, "男"),
    FEMALE(0, "女");

    SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int id;
    private String name;

    public static SexEnum getSexById(int id) {
        for (SexEnum SexEnum : SexEnum.values()) {
            if (SexEnum.getId() == id) {
                return SexEnum;
            }
        }
        return null;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SexEnum{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
