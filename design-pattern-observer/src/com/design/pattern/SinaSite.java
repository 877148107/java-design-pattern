package com.design.pattern;

/**
 * @ClassName: SinaSite
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/27 12:04
 * @Version: V1.0
 */
public class SinaSite implements Observer {

    /**
     * 温度
     */
    private float temperature;
    /**
     * 气压
     */
    private float pressure;
    /**
     * 湿度
     */
    private float humidity;

    @Override
    public void receive(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }

    public void display(){
        System.out.println("==================新浪网站天气接收===================");
        System.out.println("温度："+temperature);
        System.out.println("气压："+pressure);
        System.out.println("湿度："+humidity);
    }
}
