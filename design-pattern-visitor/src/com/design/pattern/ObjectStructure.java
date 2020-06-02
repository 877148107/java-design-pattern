package com.design.pattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: ObjectStructure
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/2 23:06
 * @Version: V1.0
 */
public class ObjectStructure {

    /**
     * 维护一个集合
     */
    List<Person> elements = new LinkedList<>();

    /**
     * 新增
     * @param person
     */
    public void attach(Person person){
        elements.add(person);
    }

    public void detach(Person person){
        elements.remove(person);
    }

    /**
     * 显示测评
     * @param action
     */
    public void display(Action action){
        for (Person person : elements) {
            person.accept(action);
        }
    }

}
