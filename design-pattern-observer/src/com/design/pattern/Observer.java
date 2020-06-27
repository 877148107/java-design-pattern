package com.design.pattern;

/**
 * @ClassName: Observer
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/27 11:49
 * @Version: V1.0
 */
public interface Observer {

    /**
     * 观察者接口接收天气的方法
     * @param temperature   温度
     * @param pressure  气压
     * @param humidity  湿度
     */
    void receive(float temperature,float pressure,float humidity);
}
