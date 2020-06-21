package com.design.pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ComputerCollege
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:30
 * @Version: V1.0
 */
public class ComputerCollege implements College {

    List<Department> departments;


    public ComputerCollege() {
        departments = new ArrayList<>();
        addDepartment("Java","Java专业");
        addDepartment("PHP","PHP专业");
        addDepartment("Python","Python专业");
    }

    @Override
    public String getName() {
        return "计算机学院";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Department department = new Department(name,desc);
        departments.add(department);
    }

    @Override
    public Iterator createIterator() {
        return new ComputerCollegeIterator(departments);
    }
}
