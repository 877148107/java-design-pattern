package com.design.pattern.abstractfactory.pizza;


/**
 * @ClassName: GreekPizz
 * =================================================
 * @Description: Java设计模式之工厂模式——工厂方法模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 20:44
 * @Version: V1.0
 */
public class ParisPepperPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("巴黎胡椒披萨材料准备中。。。。。。。。。。。。。。。");
    }
}
