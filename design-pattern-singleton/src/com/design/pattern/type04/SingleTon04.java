package com.design.pattern.type04;

/**
 * @ClassName: SingleTon04
 * =================================================
 * @Description: Java设计模式之单例模式___懒汉式(线程安全，同步方法)
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/26 23:03
 * @Version: V1.0
 */
public class SingleTon04 {

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
     * synchronized 解决线程不安全问题
     */
    public synchronized static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
