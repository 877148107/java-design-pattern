package com.design.pattern.staticproxy;

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
        TeacherDao teacherDao = new TeacherDao();

        //创建代理对象将目标对象传入
        TeacherDAOProxy targetProxy = new TeacherDAOProxy(teacherDao);

        //通过代理对象调用方法
        targetProxy.teach();
    }
}
