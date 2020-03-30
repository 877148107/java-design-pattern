package com.design.pattern.factorymethod.order;


import com.design.pattern.simplefactory.order.OrderPizza1;

/**
 * @ClassName: PizzaShop
 * =================================================
 * @Description: Java设计模式之工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 21:02
 * @Version: V1.0
 */
public class PizzaShop {

    public static void main(String[] args) {

        new NewYorkOrderPizza();
        new ParisOrderPizza();
    }
}
