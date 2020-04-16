package com.design.pattern;

/**
 * @ClassName: UserClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/16 22:58
 * @Version: V1.0
 */
public class UserClient {

    public static void main(String[] args) {
        WebSitFactory factory = new WebSitFactory();
        WebSite webSite = factory.getWebSiteByType("新闻");
        webSite.publish(new User("张三"));


        WebSite webSite1 = factory.getWebSiteByType("博客");
        webSite1.publish(new User("李四"));


        WebSite webSite2  = factory.getWebSiteByType("微信");
        webSite2.publish(new User("张三"));

        WebSite webSite3  = factory.getWebSiteByType("微信");
        webSite3.publish(new User("李四"));

        WebSite webSite4  = factory.getWebSiteByType("微信");
        webSite4.publish(new User("王五"));


        System.out.println("总数："+factory.getWebSiteCount());

        Integer x = Integer.valueOf(127);
        Integer y = Integer.valueOf(127);
        Integer w = Integer.valueOf(128);
        Integer z = Integer.valueOf(128);
        System.out.println(x==y);//true
        System.out.println(w==z);//false
    }
}
