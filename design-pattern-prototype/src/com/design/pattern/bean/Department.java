package com.design.pattern.bean;

import java.io.Serializable;

/**
 * @ClassName: Department
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/1 22:15
 * @Version: V1.0
 */
public class Department implements Cloneable, Serializable {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
