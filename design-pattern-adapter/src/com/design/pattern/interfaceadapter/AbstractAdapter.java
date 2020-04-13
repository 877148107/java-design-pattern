package com.design.pattern.interfaceadapter;

/**
 * @ClassName: AbstractAdapter
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/10 22:17
 * @Version: V1.0
 */
public class AbstractAdapter implements InterfaceAdapter {
    @Override
    public void method1() {
        System.out.println("方法1.。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void method2() {
        System.out.println("方法2.。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void method3() {
        System.out.println("方法3.。。。。。。。。。。。。。。。。。");
    }

    @Override
    public void method4() {
        System.out.println("方法4.。。。。。。。。。。。。。。。。。");
    }
}
