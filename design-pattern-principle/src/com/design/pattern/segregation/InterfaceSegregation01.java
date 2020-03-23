package com.design.pattern.segregation;

/**
 * @ClassName: InterfaceSegregation01
 * =================================================
 * @Description: Java设计模式接口隔离原则
 * 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。
 * 类B、D实现了接口
 * 类A通过接口Interface依赖B类只需要调用类B方法1.2.3；类B多余了方法4.5
 * 类C通过接口Interface依赖D类只需要调用类D方法1.4.5；类D多余了方法2.3
 * 这里违反了接口隔离原则，没有用到的方法在实现类里面也添加了，改进InterfaceSegregation02
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/23 22:34
 * @Version: V1.0
 */
public class InterfaceSegregation01 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}

/**
 * 接口Interface1有五个方法
 */
interface Interface1 {
    /**
     * 方法1
     */
    void operation1();
    /**
     * 方法2
     */
    void operation2();
    /**
     * 方法3
     */
    void operation3();
    /**
     * 方法4
     */
    void operation4();
    /**
     * 方法5
     */
    void operation5();
}

/**
 * 类B实现了接口Interface1
 */
class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }
    @Override
    public void operation4() {
        System.out.println("B 实现了 operation4");
    }
    @Override
    public void operation5() {
        System.out.println("B 实现了 operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D 实现了 operation2");
    }
    @Override
    public void operation3() {
        System.out.println("D 实现了 operation3");
    }
    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }
    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

/**
 * A 类通过接口Interface1 依赖(使用) B类，但是只会用到1,2,3方法
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}

/**
 * C 类通过接口Interface1 依赖(使用) D类，但是只会用到1,4,5方法
 */
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface1 i) {
        i.operation4();
    }
    public void depend5(Interface1 i) {
        i.operation5();
    }
}
