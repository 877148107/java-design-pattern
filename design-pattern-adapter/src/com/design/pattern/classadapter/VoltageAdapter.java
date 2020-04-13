package com.design.pattern.classadapter;

/**
 * @ClassName: VoltageAdapter
 * =================================================
 * @Description: 适配器
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/9 22:26
 * @Version: V1.0
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        int src = output220V();
        System.out.println("适配器转换电压。。。。。。。。。");
        return src/44;
    }
}
