package com.design.pattern.compositereuse;

/**
 * @ClassName: CompositeReuse
 * =================================================
 * @Description: Java设计模式合成复用原则、
 * 原则是尽量使用合成/聚合的方式，而不是使用继承
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/25 23:17
 * @Version: V1.0
 */
public class CompositeReuse {

}

class A{
    public void operation1(){
        System.out.println("方法一。。。。。。。。。。。。。。");
    }
    public void operation2(){
        System.out.println("方法二。。。。。。。。。。。。。。");
    }
    public void operation3(){
        System.out.println("方法三。。。。。。。。。。。。。。");
    }
    public void operation4(){
        System.out.println("方法四。。。。。。。。。。。。。。");
    }
}


/**************************类B、C、D、E需要使用类A方法********************************/

/**
 * 明显B和A的耦合新增强了
 */
class B extends A{
    public void use(){
        super.operation1();
    }
}

/**
 * 类C依赖类A使用其中的方法
 */
class C{

    public void user(A a){
        a.operation1();
    }
}

/**
 * 类A聚合到类D使用其中的方法
 */
class D{

    private A a;

    public void setA(A a) {
        this.a = a;
    }

    public void user(){
        this.a.operation1();
    }
}

/**
 * 类A与类E形成组合关系，使用其中的方法
 */
class E{

    public void use(){
        A a = new A();
        a.operation1();
    }
}
