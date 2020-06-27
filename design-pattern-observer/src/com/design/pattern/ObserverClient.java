package com.design.pattern;

import java.nio.file.Watchable;

/**
 * @ClassName: ObserverClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/27 12:05
 * @Version: V1.0
 */
public class ObserverClient {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        BaiduSite baiduSite = new BaiduSite();
        SinaSite sinaSite = new SinaSite();
        //注册
        weatherData.registerObserver(baiduSite);
        weatherData.registerObserver(sinaSite);
        //天气数据
        weatherData.dataChange(20,100,60);
    }
}
