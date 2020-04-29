package com.design.pattern;

/**
 * @ClassName: BlackBeanSoyaMilk
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/29 21:55
 * @Version: V1.0
 */
public class BlackBeanSoyaMilk extends SoyaMilk {

    @Override
    public void select() {
        System.out.println("第一步：选新鲜的黄豆、黑豆");
    }

    @Override
    public void add() {
        System.out.println("第二步：黄豆中添加黑豆");
    }
}
