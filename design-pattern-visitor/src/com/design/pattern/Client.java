package com.design.pattern;

/**
 * @ClassName: Client
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/6/2 23:09
 * @Version: V1.0
 */
public class Client {

    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());

        System.out.println("==============success=================");
        Success success = new Success();
        objectStructure.display(success);
        System.out.println("===============fail================");
        Fail fail = new Fail();
        objectStructure.display(fail);
    }
}
