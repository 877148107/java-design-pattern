package com.design.pattern.interfaceadapter;

/**
 * @ClassName: Client
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/10 22:19
 * @Version: V1.0
 */
public class Client {

    public static void main(String[] args) {
        //根据需求重写相应的方法
        AbstractAdapter abstractAdapter = new AbstractAdapter() {
            @Override
            public void method1() {
                System.out.println("重写方法1.。。。。。。。。。。。");
            }

            @Override
            public void method4() {
                System.out.println("重写方法4.。。。。。。。。。。。");
            }
        };

        abstractAdapter.method1();
        abstractAdapter.method2();
        abstractAdapter.method3();
        abstractAdapter.method4();
    }
}
