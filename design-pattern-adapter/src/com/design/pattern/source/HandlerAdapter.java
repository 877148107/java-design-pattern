package com.design.pattern.source;

/**
 * @ClassName: HandlerAdapter
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/10 23:15
 * @Version: V1.0
 */
public interface HandlerAdapter {

    /**
     * 判断handler是否是对应的controller
     * @param handler
     * @return
     */
    boolean supports(Object handler);

    /**
     * 调用对应的handler(controller)方法
     * @param handler
     */
    void handle(Object handler);
}

class HttpRequestHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpController();
    }
}

class SimpleControllerHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleController();
    }
}
