package com.design.pattern.director;

import com.design.pattern.builder.HouseBuilder;
import com.design.pattern.product.House;

/**
 * @ClassName: HouseDirector
 * =================================================
 * @Description: Java设计模式——————建造者模式
 * 指挥者
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/8 22:39
 * @Version: V1.0
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    public HouseDirector(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    /**
     * 如何建造房子，交给指挥者
     * @return
     */
    public House constructHouse(){
        houseBuilder.buildBisic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
