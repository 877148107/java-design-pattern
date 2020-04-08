package com.design.pattern.builder;

/**
 * @ClassName: HighHouse
 * =================================================
 * @Description: Java设计模式——————建造者模式
 * 具体建造者
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/8 22:38
 * @Version: V1.0
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBisic() {
        house.setBasic("地基30根柱子10米");
        System.out.println("高楼房子建地基30根柱子10米。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void buildWalls() {
        house.setWall("墙高10米");
        System.out.println("高楼房子砌墙高10米。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void roofed() {
        house.setRoofed("钢结构封顶");
        System.out.println("高楼房子钢结构封顶。。。。。。。。。。。。。。。。。");
    }
}
