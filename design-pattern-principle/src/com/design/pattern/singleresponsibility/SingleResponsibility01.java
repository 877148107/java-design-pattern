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
public class SingleResponsibility01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");
    }

}

/**
 * 交通工具类
 * 在方的run方法中，违反了单一职责原则.一个类负责了多项职责
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");
    }
}

