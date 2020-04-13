package com.design.pattern;

/**
 * @ClassName: PhoneClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/11 17:28
 * @Version: V1.0
 */
//桥接使用类
public class PhoneClient {

    public static void main(String[] args) {
        PhoneStyle flodPhone = new FlodPhone(new XiaoMi());
        flodPhone.open();
        flodPhone.call();
        flodPhone.close();
        System.out.println("-------------------------------------------------");
        PhoneStyle verticalPhone = new VerticalPhone(new XiaoMi());
        verticalPhone.open();
        verticalPhone.call();
        verticalPhone.close();
    }
}
