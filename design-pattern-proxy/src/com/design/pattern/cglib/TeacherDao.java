package com.design.pattern.cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TeacherDao  {
    public void teach() {
        System.out.println("老师授课中.............");
    }
    public String sayHello(String name) {
        return " hello "+ name;
    }
}

class ProxyFactory implements MethodInterceptor {

    /**
     * 目标对象
     */
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 返回目标对象的一个代理对象
     * Java底层对象
     * @return
     */
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，及代理对象
        return enhancer.create();
    }


    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib代理开始："+args);
        Object invoke = method.invoke(target, args);
        System.out.println("Cglib代理完成："+invoke);
        return invoke;
    }
}
