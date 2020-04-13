package com.design.pattern;

/**
 * @ClassName: Decorator
 * =================================================
 * @Description: 装饰着
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/13 22:19
 * @Version: V1.0
 */
public class Decorator extends Drink {

    Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return super.getPrice()+drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription()+"-"+super.getPrice()+"&&"+drink.getDescription();
    }
}

class Milk extends Decorator{
    public Milk(Drink drink) {
        super(drink);
        setDescription("一份牛奶");
        setPrice(5f);
    }
}

class Chocolate extends Decorator{
    public Chocolate(Drink drink) {
        super(drink);
        setDescription("一份巧克力");
        setPrice(2f);
    }
}
