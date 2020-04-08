package com.design.pattern.abstractfactory.factory;

import com.design.pattern.abstractfactory.pizza.NewYorkCheesePizz;
import com.design.pattern.abstractfactory.pizza.NewYorkPepperPizza;
import com.design.pattern.abstractfactory.pizza.Pizza;

/**
 * @ClassName: NewYorkFactory
 * =================================================
 * @Description: Java设计模式之抽象工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/31 21:55
 * @Version: V1.0
 */
public class NewYorkFactory implements AbstractFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        switch (orderType){
            case "pepper":
                pizza = new NewYorkPepperPizza();
                pizza.setName("纽约胡椒披萨");
                break;
            case "cheese":
                pizza = new NewYorkCheesePizz();
                pizza.setName("纽约奶酪披萨");
                break;
            default:
                break;
        }
        return pizza;
    }
}
