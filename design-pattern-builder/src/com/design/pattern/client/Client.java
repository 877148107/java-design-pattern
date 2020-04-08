package com.design.pattern.client;

import com.design.pattern.builder.CommonHouse;
import com.design.pattern.builder.HighHouse;
import com.design.pattern.director.HouseDirector;
import com.design.pattern.product.House;

/**
 * @ClassName: Client
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/8 22:43
 * @Version: V1.0
 */
public class Client {

    public static void main(String[] args) {
        //建一栋高楼
        HighHouse highHouse = new HighHouse();
        HouseDirector director = new HouseDirector(highHouse);
        House house = director.constructHouse();
        System.out.println(house);
        System.out.println("----------------------------------------------------------------------------------");
        //建一栋普通房子
        CommonHouse commonHouse = new CommonHouse();
        HouseDirector director1 = new HouseDirector(commonHouse);
        House house1 = director1.constructHouse();
        System.out.println(house1);
    }
}
