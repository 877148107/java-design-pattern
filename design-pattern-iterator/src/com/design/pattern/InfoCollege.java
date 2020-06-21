package com.design.pattern;

import java.util.Iterator;

/**
 * @ClassName: InfoCollege
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:29
 * @Version: V1.0
 */
public class InfoCollege implements College {

    Department[] departments;
    int positon = 0;

    public InfoCollege() {
        departments = new Department[5];
        addDepartment("信息工程","信息工程学院");
        addDepartment("信息安全","信息安全学院");
        addDepartment("通信工程","通信工程学院");
    }

    @Override
    public String getName() {
        return "信息工程学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments[positon] = department;
        positon++;
    }

    @Override
    public Iterator createIterator() {
        return new InfoCollegeIterator(departments);
    }
}
