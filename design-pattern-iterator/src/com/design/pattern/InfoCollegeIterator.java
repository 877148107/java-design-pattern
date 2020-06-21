package com.design.pattern;

import java.util.Iterator;

/**
 * @ClassName: InfoCollegeIterator
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:18
 * @Version: V1.0
 */
public class InfoCollegeIterator implements Iterator {

    /**
     * 存放院系
     */
    Department[] departments;
    /**
     * 遍历位置
     */
    int position = 0;

    public InfoCollegeIterator(Department[] departments) {
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if( position > departments.length || departments[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments[position];
        position += 1;
        return department;
    }

    @Override
    public void remove() {

    }
}
