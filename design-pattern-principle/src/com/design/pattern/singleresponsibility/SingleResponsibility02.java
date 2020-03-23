package com.design.pattern.singleresponsibility;

/**
 * @ClassName: SingleResponsibility01
 * =================================================
 * @Description: Java设计模式单一职责原则
 * 1) 降低类的复杂度，一个类只负责一项职责。
 *
 * 2) 提高类的可读性，可维护性
 *
 * 3) 降低变更引起的风险
 *
 * 4) 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；
 * 只有类中方法数量足够少，可以在方法级别保持单一职责原则
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/23 21:56
 * @Version: V1.0
 */
public class SingleResponsibility02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();

        airVehicle.run("飞机");
    }

}

/**
 *
 方案2的分析
 //1. 遵守单一职责原则
 //2. 但是这样做的改动很大，即将类分解，同时修改客户端
 //3. 改进：直接修改Vehicle 类，改动的代码会比较少=>方案3
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
