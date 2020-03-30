package com.design.pattern.tradition.order;

import com.design.pattern.tradition.pizza.CheesePizz;
import com.design.pattern.tradition.pizza.GreekPizza;
import com.design.pattern.tradition.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * =================================================
 * @Description: Java设计模式之工厂模式
 *  * 订购披萨的需求传统方式的实现
 *  订购披萨类
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 20:50
 * @Version: V1.0
 */
public class OrderPizza {

    /**
     * OrderPizza构造器
     */
    public OrderPizza() {
        //获取用户想要的披萨种类
        String orderType = getType();
        Pizza pizza;
        switch (orderType){
            case "greek":
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
                this.createPizza(pizza);
                break;
            case "cheese":
                pizza = new CheesePizz();
                pizza.setName("奶酪披萨");
                this.createPizza(pizza);
                break;
            default:
                System.out.println("sorry没有这类披萨。。。。。。。。");
                break;
        }
    }

    /**
     * 披萨制作过程
     * @param pizza
     */
    private void createPizza(Pizza pizza) {
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
    }

    /**
     * 写一个方法，可以获取客户希望订购的披萨种类
     * @return
     */
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }
}
