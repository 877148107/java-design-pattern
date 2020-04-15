package com.design.pattern;

/**
 * @ClassName: HomeTheaterClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/15 23:19
 * @Version: V1.0
 */
public class HomeTheaterClient {

    public static void main(String[] args) {
        HomeTheaterFacade facade = new HomeTheaterFacade();
        System.out.println("===========================================");
        facade.ready();
        System.out.println("===========================================");
        facade.play();
        System.out.println("===========================================");
        facade.pause();
        System.out.println("===========================================");
        facade.end();
    }
}
