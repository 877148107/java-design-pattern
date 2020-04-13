package com.design.pattern;

/**
 * @ClassName: PhoneStyle
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/11 17:22
 * @Version: V1.0
 */
//桥接类
public abstract class PhoneStyle {

    /**
     * 聚合品牌类
     */
    private Brand brand;

    public PhoneStyle(Brand brand) {
        this.brand = brand;
    }

    public void open(){
        brand.open();
    }

    public void call(){
        brand.call();
    }

    public void close(){
        brand.close();
    }
}

class FlodPhone extends PhoneStyle{

    public FlodPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        System.out.println("折叠手机");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("折叠手机");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("折叠手机");
        super.close();
    }
}

class VerticalPhone extends PhoneStyle{

    public VerticalPhone(Brand brand) {
        super(brand);
    }

    @Override
    public void open(){
        System.out.println("直式手机");
        super.open();
    }

    @Override
    public void call() {
        System.out.println("直式手机");
        super.call();
    }

    @Override
    public void close() {
        System.out.println("直式手机");
        super.close();
    }
}
