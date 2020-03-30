package com.design.pattern.factorymethod.order;


import com.design.pattern.factorymethod.pizza.NewYorkCheesePizz;
import com.design.pattern.factorymethod.pizza.NewYorkPepperPizza;
import com.design.pattern.factorymethod.pizza.Pizza;

/**
 * @ClassName: NewYorkOrder
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 23:01
 * @Version: V1.0
 */
public class NewYorkOrderPizza extends OrderPizza {


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
