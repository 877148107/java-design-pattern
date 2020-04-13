package com.design.pattern.objectadapter;

import com.design.pattern.classadapter.Voltage220V;
import com.design.pattern.classadapter.Voltage5V;

/**
 * @ClassName: VoltageAdapter
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/9 23:00
 * @Version: V1.0
 */
public class VoltageAdapter implements Voltage5V {

    Voltage220V voltage220V;

    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int src = voltage220V.output220V();
        System.out.println("适配器转换电压。。。。。。。。。");
        return src/44;
    }
}
