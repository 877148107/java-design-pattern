package com.design.pattern.abstractfactory.factory;

import com.design.pattern.abstractfactory.pizza.*;

/**
 * @ClassName: ParisFactory
 * =================================================
 * @Description: Java设计模式之抽象工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/31 21:55
 * @Version: V1.0
 */
public class ParisFactory implements AbstractFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "pepper":
                pizza = new ParisPepperPizza();
                pizza.setName("巴黎胡椒披萨");
                break;
            case "cheese":
                pizza = new ParisCheesePizz();
                pizza.setName("巴黎奶酪披萨");
                break;
            default:
                break;
        }
        return pizza;
    }
}
