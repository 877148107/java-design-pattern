package com.design.pattern.tradition.pizza;

/**
 * @ClassName: GreekPizz
 * =================================================
 * @Description: Java设计模式之工厂模式
 *  * 订购披萨的需求传统方式的实现
 *  希腊披萨
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 20:44
 * @Version: V1.0
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("希腊披萨材料准备中。。。。。。。。。。。。。。。");
    }
}
