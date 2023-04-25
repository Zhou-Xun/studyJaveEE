package com.learn.chapter4.pojo;

public class PageParams {

    // 当前页码
    private Integer page;
    // 每页限制条数
    private Integer pageSize;
    // 是否启动插件，不启动不分页
    private Boolean useFlag;
    // 是否检测页码有效性，true时，页码大于最大页数抛出异常
    // 是否清楚最后一个orderBy后面的语句
    // 总条数，插件回填
    // 总页数，插件回填
    private int start;
    private int limit;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }
}
