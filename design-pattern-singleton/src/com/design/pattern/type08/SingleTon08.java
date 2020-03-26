package com.design.pattern.type08;

/**
 * @ClassName: SingleTon08
 * =================================================
 * @Description: Java设计模式之单例模式___枚举
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/26 23:26
 * @Version: V1.0
 */
public class SingleTon08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}


enum Singleton{
    INSTANCE;

    public void hello(){
        System.out.println("hello");
    }
}
