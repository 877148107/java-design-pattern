package com.design.pattern;

/**
 * @ClassName: Drink
 * =================================================
 * @Description: 被修饰者
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/13 22:08
 * @Version: V1.0
 */
public abstract class Drink {

    /**
     * 描述
     */
    private String description;

    /**
     * 单价
     */
    private float price;

    /**
     * 抽象方法，子类实现计算费用
     * @return
     */
    public abstract float cost();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
