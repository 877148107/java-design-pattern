package com.design.pattern.segregation;

/**
 * @ClassName: InterfaceSegregation02
 * =================================================
 * @Description: Java设计模式接口隔离原则
 * 客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。
 * 类Bb实现接口Interface2、Interface3
 * 类Dd试下了接口Interface2、Interface4
 * 类Aa通过接口Interface依赖Bb类只需要调用类B方法1.2.3
 * 类Cc通过接口Interface依赖Dd类只需要调用类D方法1.4.5
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/23 22:34
 * @Version: V1.0
 */
public class InterfaceSegregation02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // A类通过接口去依赖B类
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        // C类通过接口去依赖(使用)D类
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }

}

/**
 * 接口2
 */
interface Interface2 {
    /**
     * 方法
     */
    void operation1();

}

/**
 * 接口3
 */
interface Interface3 {
    /**
     * 方法2
     */
    void operation2();
    /**
     * 方法3
     */
    void operation3();
}

/**
 * 接口4
 */
interface Interface4 {
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
 * 类Bb实现类Interface2，Interface3
 */
class Bb implements Interface2, Interface3 {
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

}

/**
 * 类Dd实现了接口Interface2，Interface4
 */
class Dd implements Interface2, Interface4 {
    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
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
 * 类Aa依赖接口Interface1，Interface1调用方法1.2.3
 */
class Aa {
    public void depend1(Interface2 i) {
        i.operation1();
    }

    public void depend2(Interface3 i) {
        i.operation2();
    }

    public void depend3(Interface3 i) {
        i.operation3();
    }
}

/**
 * 类Cc依赖接口Interface1，Interface3调用方法1.4.5
 */
class Cc {
    public void depend1(Interface2 i) {
        i.operation1();
    }

    public void depend4(Interface4 i) {
        i.operation4();
    }

    public void depend5(Interface4 i) {
        i.operation5();
    }
}
