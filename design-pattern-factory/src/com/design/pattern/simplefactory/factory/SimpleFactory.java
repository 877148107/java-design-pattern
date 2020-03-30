package com.design.pattern.simplefactory.factory;

import com.design.pattern.simplefactory.pizza.CheesePizz;
import com.design.pattern.simplefactory.pizza.GreekPizza;
import com.design.pattern.simplefactory.pizza.Pizza;

/**
 * @ClassName: SimpleFactory
 * =================================================
 * @Description: Java设计模式之工厂模式——简单工厂模式
 * 简单工厂模式也叫静态工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 22:13
 * @Version: V1.0
 */
public class SimpleFactory {

    /**
     * 根据不同的披萨类型制作不同的披萨。
     * 简单工厂模式也叫静态工厂模式，将这个方法写成一个静态的方法。
     * 这个类实例化后就加载这个类方法。其他类使用的时候直接用这个类的方法即可不需要new一个工厂类
     * @param orderType
     * @return
     */
    public Pizza createPizza(String orderType){
        Pizza pizza = null;
        switch (orderType){
            case "greek":
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
                break;
            case "cheese":
                pizza = new CheesePizz();
                pizza.setName("奶酪披萨");
                break;
            default:
                break;
        }
        return pizza;
    }
}
