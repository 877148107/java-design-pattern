package com.design.pattern.dynamic;

/**
 * @ClassName: TeachClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/23 20:53
 * @Version: V1.0
 */
public class TeachClient {

    public static void main(String[] args) {
        //创建目标对象
        TeacherDao target = new TeacherDao();

        //给目标对象target创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(target).getProxyInstance();
        System.out.println("proxyInstance="+proxyInstance.getClass());

        //通过代理对象调用方法
        proxyInstance.teach();
        proxyInstance.sayHello("张三");
    }
}
