package com.design.pattern.abstractfactory.order;

import com.design.pattern.abstractfactory.factory.AbstractFactory;
import com.design.pattern.abstractfactory.pizza.Pizza;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * =================================================
 * @Description: Java设计模式之抽象工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/31 21:56
 * @Version: V1.0
 */
public class OrderPizza {

    private AbstractFactory abstractFactory;

    public OrderPizza(AbstractFactory factory){
        this.abstractFactory = factory;
        setFactory();
    }

    public void setFactory(){
        System.out.println("抽象工厂模式。。。。。。。。。。。。。。。。");
        //获取用户想要的披萨种类
        String orderType = getType();
        Pizza pizza = abstractFactory.createPizza(orderType);
        if (pizza !=null) {
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }else{
            System.out.println("sorry没有改种类的披萨。。。。。。。");
        }
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
