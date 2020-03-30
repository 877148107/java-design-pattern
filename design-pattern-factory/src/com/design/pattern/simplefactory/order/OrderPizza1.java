package com.design.pattern.simplefactory.order;

import com.design.pattern.simplefactory.factory.SimpleFactory1;
import com.design.pattern.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName: OrderPizza
 * =================================================
 * @Description: Java设计模式之工厂模式——简单工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 22:17
 * @Version: V1.0
 */
public class OrderPizza1 {

    /**
     * 这里是一个聚合关系，如果要用组合关系直接使用的话new一个工厂即可
     * private SimpleFactory simpleFactory = new SimpleFactory();
     */

    public OrderPizza1(){
        System.out.println("静态工厂模式。。。。。。。。。。。。。。。。");
        //获取用户想要的披萨种类
        String orderType = getType();
        Pizza pizza = SimpleFactory1.createPizza(orderType);
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
