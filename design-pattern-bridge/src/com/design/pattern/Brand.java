package com.design.pattern;


//品牌：手机行为开机、打电话、关机
public interface Brand {

    void open();
    void call();
    void close();
}

class XiaoMi implements Brand{

    @Override
    public void open() {
        System.out.println("XiaoMi开机。。。。。。。。。。");
    }

    @Override
    public void call() {
        System.out.println("XiaoMi打电话。。。。。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("XiaoMi关机。。。。。。。。。。");
    }
}

class HuaWei implements Brand{

    @Override
    public void open() {
        System.out.println("HuaWei开机。。。。。。。。。。");
    }

    @Override
    public void call() {
        System.out.println("HuaWei打电话。。。。。。。。。。");
    }

    @Override
    public void close() {
        System.out.println("HuaWei关机。。。。。。。。。。");
    }
}
