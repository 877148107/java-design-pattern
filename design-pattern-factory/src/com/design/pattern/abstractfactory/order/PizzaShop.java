package com.design.pattern.abstractfactory.order;


import com.design.pattern.abstractfactory.factory.NewYorkFactory;
import com.design.pattern.abstractfactory.factory.ParisFactory;
import com.design.pattern.factorymethod.order.NewYorkOrderPizza;
import com.design.pattern.factorymethod.order.ParisOrderPizza;

import java.util.Calendar;

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
        new OrderPizza(new NewYorkFactory());
        new OrderPizza(new ParisFactory());
    }
}
