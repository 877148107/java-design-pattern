package com.design.pattern;

/**
 * @ClassName: SoyaMillClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/29 22:01
 * @Version: V1.0
 */
public class SoyaMillClient {

    public static void main(String[] args) {
        //制作黑豆豆浆
        SoyaMilk blackBeanSoyaMilk  = new BlackBeanSoyaMilk();
        blackBeanSoyaMilk.make();
        System.out.println("=======================================================");
        //制作花生豆浆
        SoyaMilk peanutMilk = new PeanutMilk();
        peanutMilk.make();
        System.out.println("=======================================================");
        //制作纯豆浆
        SoyaMilk pureSoyaMilk = new PureSoyaMilk();
        pureSoyaMilk.make();
    }
}
