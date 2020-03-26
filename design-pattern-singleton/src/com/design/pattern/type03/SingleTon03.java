package com.design.pattern.type03;

/**
 * @ClassName: SingleTon03
 * =================================================
 * @Description: Java设计模式之单例模式___懒汉式(线程不安全)
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/26 22:50
 * @Version: V1.0
 */
public class SingleTon03 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{

    private static Singleton instance;

    private Singleton(){

    }

    /**
     * 静态公有方法，当使用到该方法的时候才去创建
     */
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
