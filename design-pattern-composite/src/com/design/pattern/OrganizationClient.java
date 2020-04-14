package com.design.pattern;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: OrganizationClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/14 22:23
 * @Version: V1.0
 */
public class OrganizationClient {

    public static void main(String[] args) {
        //跟下面的案例类似
        //1.Map就是一个抽象的构建，这里是一个接口。类似案例里面的OrganizationComponent
        //2.HashMap是一个中间构建实现相关的方法，put、putAll。。。。，类似案例里面的University、College
        //3.Node是HashMap的静态内部类，类似案例里面的leaf叶节点Department，
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(0,"清华大学");

        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1,"北京大学");
        map1.put(2,"复旦大学");
        map.putAll(map1);
        System.out.println(map.toString());


//        OrganizationComponent university = new University("清华大学", "66666");
//
//        OrganizationComponent college1 = new College("计算机学院","计算机学院");
//        OrganizationComponent college2 = new College("信息工程学院","信息工程学院");
//
//        college1.add(new Department("软件工程","电子商务"));
//        college1.add(new Department("游戏策划","游戏策划"));
//
//        college2.add(new Department("通信工程","通信工程"));
//        college2.add(new Department("信息工程","信息工程"));
//
//        university.add(college1);
//        university.add(college2);
//
//        university.print();
    }
}
