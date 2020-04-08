package com.design.pattern.builder;

import com.design.pattern.product.House;

/**
 * @ClassName: HouseBuilder
 * =================================================
 * @Description: Java设计模式——————建造者模式
 * 抽象建造者
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/8 22:30
 * @Version: V1.0
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /**
     * 地基
     */
    public abstract void buildBisic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    /**
     * 将产品返回
     * @return
     */
    public House build(){
        System.out.println("房子建造完成。。。。。。。。。。。。。。。。");
        return house;
    }
}
