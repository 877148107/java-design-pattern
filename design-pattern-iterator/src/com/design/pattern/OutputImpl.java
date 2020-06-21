package com.design.pattern;

import java.util.Iterator;
import java.util.List;

/**
 * @ClassName: OutputImpl
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:38
 * @Version: V1.0
 */
public class OutputImpl {

    List<College> collegeList;

    public OutputImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    /**
     * 打印学院
     */
    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=================="+college.getName()+"=================");
            printDepartment(college.createIterator());
        }
    }

    /**
     * 打印院系
     * @param iterator
     */
    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Department department = (Department) iterator.next();
            System.out.println(department.getName());
        }
    }
}
