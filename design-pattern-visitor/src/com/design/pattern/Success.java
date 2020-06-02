package com.design.pattern;

/**
 * @ClassName: Success
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/2 23:03
 * @Version: V1.0
 */
public class Success extends Action {
    @Override
    public void getManResult(Man man) {
        System.out.println("男人给的测评是成功。。。。。。。。");
    }

    @Override
    public void getWomanResult(Woman woman) {
        System.out.println("女人给的测评是成功。。。。。。。。");
    }
}
