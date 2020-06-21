package com.design.pattern;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: ComputerCollegeIterator
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:25
 * @Version: V1.0
 */
public class ComputerCollegeIterator implements Iterator {

    List<Department> departments;
    int position = -1;

    public ComputerCollegeIterator(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(position >= departments.size() -1){
            return false;
        }
        position += 1;
        return true;
    }

    @Override
    public Object next() {
        Department department = departments.get(position);
        return department;
    }

    @Override
    public void remove() {

    }
}
