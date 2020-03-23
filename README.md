# Java设计模式

------

# 1.什么是设计模式

​		软件设计模式（Design pattern），又称设计模式，是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。使用设计模式是为了可重用代码、让代码更容易被他人理解、保证代码可靠性、程序的重用性。

# 2.设计模式的目的

​		1）、代码重用性（相同功能的代码，不用多次编写）

​		2）、可读性（编程规范性，便于其他人的阅读和理解）

​		3）、可扩展性（当需要增加新的功能时，非常方便）

​		4）、可靠性（当我们新增功能后对原来的功能没有影响）

​		5）、[程序高内聚、低耦合](https://baike.baidu.com/item/高内聚低耦合/5227009)

## 1.设计模式七大原则

### 		1) 、单一职责原则

​				对类来说的，即一个类应该只负责一项职责。如类A负责两个不同职责：职责1，职责2。当职责1需求变更而改		变A时，可能造成职责2执行错误，所以需要将类A的粒度分解为 A1，A2。

​		1) 降低类的复杂度，一个类只负责一项职责。

​		2) 提高类的可读性，可维护性

​		3) 降低变更引起的风险

​		4) 通常情况下，**我们应当遵守单一职责原则**，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类中方		法数量足够少，可以在方法级别保持单一职责原则

**遵循方法级别的单一原则**

```java
public class SingleResponsibility03 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Vehicle2 vehicle2  = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runWater("轮船");
        vehicle2.runAir("飞机");
    }

}

/**
 * //方式3的分析
 * //1. 这种修改方法没有对原来的类做大的修改，只是增加方法
 * //2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
class Vehicle2 {
    public void run(String vehicle) {
        System.out.println(vehicle + " 在公路上运行....");

    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + " 在天空上运行....");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle + " 在水中行....");
    }
}
```

### **遵循类的单一原则**

```java
public class SingleResponsibility02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();

        airVehicle.run("飞机");
    }

}

/**
 *
 方案2的分析
 //1. 遵守单一职责原则
 //2. 但是这样做的改动很大，即将类分解，同时修改客户端
 //3. 改进：直接修改Vehicle 类，改动的代码会比较少=>方案3
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "公路运行");
    }
}

class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "天空运行");
    }
}

class WaterVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "水中运行");
    }
}
```

### 		

### 		2)、 接口隔离原则

​		客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。

**没有遵循接口隔离原则**

```java
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
```

**遵循了接口隔离原则**

```java
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
```

### 		3) 、依赖倒转(倒置)原则

### 		4) 、里氏替换原则

### 		5)、 开闭原则

### 		6)、 迪米特法则

### 		7)、合成复用原则