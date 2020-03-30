package com.design.pattern.factorymethod.order;

import com.design.pattern.factorymethod.pizza.*;

/**
 * @ClassName: ParisOrderPizza
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 23:02
 * @Version: V1.0
 */
public class ParisOrderPizza extends OrderPizza {
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
