package com.design.pattern.classadapter;

/**
 * @ClassName: Voltage220V
 * =================================================
 * @Description: 被适配的类
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/9 22:18
 * @Version: V1.0
 */
public class Voltage220V {

    public int output220V(){
        System.out.println("200V电压................");
        return 220;
    }
}
