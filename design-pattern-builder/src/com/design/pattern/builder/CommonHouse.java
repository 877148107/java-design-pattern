package com.design.pattern.builder;

/**
 * @ClassName: CommonHouse
 * =================================================
 * @Description: Java设计模式——————建造者模式
 * 具体建造者
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/8 22:36
 * @Version: V1.0
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBisic() {
        house.setBasic("地基9根柱子2米");
        System.out.println("普通房子建地基9根柱子2米。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void buildWalls() {
        house.setWall("墙高9米");
        System.out.println("普通房子建砌墙9米。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void roofed() {
        house.setRoofed("瓦片封顶");
        System.out.println("普通房子建瓦片封顶。。。。。。。。。。。。。。。。。");
    }
}
