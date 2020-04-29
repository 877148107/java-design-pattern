package com.design.pattern.staticproxy;


public interface ITeacherDao {

    void teach();
}

class TeacherDao implements ITeacherDao{

    @Override
    public void teach() {
        System.out.println("老师授课中.............");
    }
}

class TeacherDAOProxy implements ITeacherDao{

    /**
     * 目标对象通过接口聚合
     */
    ITeacherDao target;

    public TeacherDAOProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("静态代理开始。。。。。。。。。。。");
        target.teach();
        System.out.println("静态代理完成。。。。。。。。。。。。。。。");
    }
}
