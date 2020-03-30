package com.design.pattern.factorymethod.pizza;

/**
 * @ClassName: Pizza
 * =================================================
 * @Description: Java设计模式之工厂模式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/30 20:38
 * @Version: V1.0
 */
public abstract class Pizza {

    /**
     * 名称
     */
    private String name;

    /**
     * 由于准备披萨的材料不同所以这个将这个方法给做成抽象方法让子类去实现
     * 抽象方法子类实现
     */
    public abstract void prepare();


    public void bake(){
        System.out.println(name+"制作烘烤中。。。。。。。。。。、");
    }

    public void cut(){
        System.out.println(name+"切割中。。。。。。。。。。。。。");
    }

    public void box(){
        System.out.println(name+"打包中。。。。。。。。。。。。。。。。");
    }

    public void setName(String name) {
        this.name = name;
    }
}
