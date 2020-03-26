package com.design.pattern.type01;

/**
 * @ClassName: SingleTon01
 * =================================================
 * @Description: Java设计模式之单例模式___饿汉式(静态常量)
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/26 22:23
 * @Version: V1.0
 */
public class SingleTon01 {

    public static void main(String[] args) {
        //测试
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode=" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}

class Singleton{

    /**
     * 私有化构造器，防止外部new
     */
    private Singleton(){

    }

    /**
     * 本类内部创建对象实例
     */
    private final static Singleton instance = new Singleton();

    /**
     * 提供一个公有方法返回实例对象
     */
    public static Singleton getInstance(){
        return instance;
    }
}
