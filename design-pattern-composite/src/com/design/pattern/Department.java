package com.design.pattern;

/**
 * @ClassName: Department
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/14 22:26
 * @Version: V1.0
 */
public class Department extends OrganizationComponent {
    public Department(String name, String desc) {
        super(name, desc);
    }

    @Override
    public void print() {
        System.out.println(getName());
    }
}
