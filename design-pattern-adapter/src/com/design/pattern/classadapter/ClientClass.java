package com.design.pattern.classadapter;

/**
 * @ClassName: ClientClass
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/9 22:30
 * @Version: V1.0
 */
public class ClientClass {

    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }

}
