package com.design.pattern.dynamic;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public interface ITeacherDao {

    void teach();

    /**
     * 拓展
     */
    String sayHello(String name);
}

class TeacherDao implements ITeacherDao {

    @Override
    public void teach() {
        System.out.println("老师授课中.............");
    }

    @Override
    public String sayHello(String name) {
        return " hello "+ name;
    }
}


class ProxyFactory {

    /**
     * 维护一个目标对象 Object
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 根据传入的目标对象
     * 利用返回机制，返回一个代理对象
     * 然后通过代理对象，调用目标方法
     * @return
     */
    public Object getProxyInstance(){
        /**
         * ClassLoader loader:指定当前目标对象使用的加载器，获取加载器的方法
         * Class<?>[] interfaces：目标对象实现的接口类型，使用泛型方法确认类型
         * InvocationHandler h：事件处理执行目标对象方法时，会触发事件处理器方法，会把当前执行的目标方法作为参数传入.
         *                      这里以一个匿名对象参数的形式传进去
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始："+args);
                        //反射机制调用对象方法
                        Object invoke = method.invoke(target, args);
                        System.out.println("JDK代理完成："+invoke);
                        return invoke;
                    }
                });
    }
}
