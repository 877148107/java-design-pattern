package com.design.pattern;

/**
 * @ClassName: Coffee
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/13 22:11
 * @Version: V1.0
 */
public class Coffee extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}

class Espresso extends Coffee{
    public Espresso() {
        setDescription("意大利浓咖啡");
        setPrice(5f);
    }
}

class ShortBlack extends Coffee{
    public ShortBlack() {
        setDescription("浓咖啡");
        setPrice(4f);
    }
}

class LongBlack extends Coffee{
    public LongBlack() {
        setDescription("美式咖啡");
        setPrice(6f);
    }
}

