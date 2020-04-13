package com.design.pattern.source;

public interface Controller {

}

class SimpleController implements Controller{
    public void doSimpleController(){
        System.out.println("执行doSimpleController.................");
    }
}


class HttpController implements Controller{
    public void doHttpController(){
        System.out.println("执行doHttpController.................");
    }
}
