package com.design.pattern;

import java.util.Iterator;

/**
 * @ClassName: College
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/16 23:27
 * @Version: V1.0
 */
public interface College {

    String getName();

    void addDepartment(String name,String desc);

    Iterator createIterator();
}
