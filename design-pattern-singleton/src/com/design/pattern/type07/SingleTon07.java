package com.design.pattern.type07;

/**
 * @ClassName: SingleTon07
 * =================================================
 * @Description: Java设计模式之单例模式___静态内部类
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/26 23:03
 * @Version: V1.0
 */
public class SingleTon07 {

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{


    private Singleton(){

    }

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    /**
     * 静态公有方法，当使用到该方法的时候才去创建
     */
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
