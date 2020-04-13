package com.design.pattern.classadapter;

/**
 * @ClassName: Phone
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/9 22:28
 * @Version: V1.0
 */
public class Phone {

    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V()==5) {
            System.out.println("电压5V可以正常充电。。。。。。。。。。。。。。。");
        }else{
            System.out.println("电压过高不能充电。。。。。。。。。。。。。。");
        }
    }
}
