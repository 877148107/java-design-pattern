package com.design.pattern.factorymethod.order;

import com.design.pattern.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 23:02
 * @Version: V1.0
 */
public abstract class OrderPizza {

    /**
     * 抽象方法子类实现
     * @param orderType
     * @return
     */
    public abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        System.out.println("工厂方法模式。。。。。。。。。。。。。。。。");
        //获取用户想要的披萨种类
        String orderType = getType();
        Pizza pizza = createPizza(orderType);
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
