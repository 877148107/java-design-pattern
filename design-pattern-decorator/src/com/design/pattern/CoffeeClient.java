package com.design.pattern;

/**
 * @ClassName: CoffeeClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/13 22:15
 * @Version: V1.0
 */
public class CoffeeClient {

    public static void main(String[] args) {
        Drink longBlack = new LongBlack();
        System.out.println("描述："+longBlack.getDescription());
        System.out.println("价格："+longBlack.cost());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        Drink espresso = new Espresso();
        System.out.println("描述："+espresso.getDescription());
        System.out.println("价格："+espresso.cost());
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("=====美式咖啡+一份牛奶+两份巧克力======");
        longBlack = new Milk(longBlack);
        longBlack = new Chocolate(longBlack);
        longBlack = new Chocolate(longBlack);
        System.out.println("描述："+longBlack.getDescription());
        System.out.println("加一份牛奶,两份巧克力价格:"+longBlack.cost());
        System.out.println("=====意大利浓咖啡+一份牛奶+一份巧克力======");
        espresso = new Milk(espresso);
        espresso = new Chocolate(espresso);
        System.out.println("描述："+espresso.getDescription());
        System.out.println("加一份牛奶,一份巧克力价格:"+espresso.cost());

    }
}
