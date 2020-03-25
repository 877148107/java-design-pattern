package com.design.pattern.inversion;

/**
 * @ClassName: DependenceInversion03
 * =================================================
 * @Description: Java设计模式依赖倒置原则，依赖关系传递的三种方式
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/24 21:36
 * @Version: V1.0
 */
public class DependenceInversion03 {

    public static void main(String[] args) {
        //方式一、通过接口传递实现依赖。小米实现了接口ITV01，IOpenAndClose01依赖接口ITV01，OpenAndClose01实现了接口IOpenAndClose01
        //然后通过接口IOpenAndClose01依赖接口ITV01调用open方法执行打开电视机操作
        XiaoMi xiaoMi = new XiaoMi();
        OpenAndClose01 openAndClose01 = new OpenAndClose01();
        openAndClose01.open(xiaoMi);

        //方式二、通过构造器进行依赖传递。ChangHong实现了接口ITV02，OpenAndClose02通过构造器依赖接口ITV02
        //然后调用open方法执行了电视机打开操作
        ChangHong changHong = new ChangHong();
		OpenAndClose02 openAndClose02 = new OpenAndClose02(changHong);
        openAndClose02.open();
        //方式三、通过setter方法进行依赖传递。ChuangWei实现了接口ITV03，OpenAndClose03通过setter方法将依赖的接口ITV03传值
        //然后调用open方法执行电视机打开操作
        ChuangWei chuangWei = new ChuangWei();
        OpenAndClose03 openAndClose03 = new OpenAndClose03();
        openAndClose03.setTv(chuangWei);
        openAndClose03.open();

    }

}

/**
 * 方式1： 通过接口传递实现依赖
 */
/**
 * 开关的接口
 */
 interface IOpenAndClose01 {
    /**
     * 抽象方法,打开接口
      * @param tv
     */
    void open(ITV01 tv);
 }

 interface ITV01 {
    void play();
 }

 class XiaoMi implements ITV01 {
	@Override
	public void play() {
		System.out.println("小爱同学打开小米电视");
	}

 }

/**
 * 实现接口
 */
 class OpenAndClose01 implements IOpenAndClose01{
    @Override
    public void open(ITV01 tv){
        tv.play();
    }
 }

/**
 * 方式2: 通过构造方法依赖传递
 */
 interface IOpenAndClose02 {
    /**
     * 抽象方法,打开接口
     */
    void open();
 }

 interface ITV02 {
    void play();
 }

 class OpenAndClose02 implements IOpenAndClose02{
     /**
      * 成员
      */
    public ITV02 tv;

     /**
      * 构造器
      * @param tv
      */
    public OpenAndClose02(ITV02 tv){
        this.tv = tv;
    }

    @Override
    public void open(){
        this.tv.play();
    }
 }

class ChangHong implements ITV02 {
    @Override
    public void play() {
        System.out.println("小爱同学打开长虹电视");
    }

}


/**
 * 方式3 , 通过setter方法传递
 */
interface IOpenAndClose03 {
    void open();

    void setTv(ITV03 tv);
}

interface ITV03 {
    void play();
}

class OpenAndClose03 implements IOpenAndClose03 {
    private ITV03 tv;

    @Override
    public void setTv(ITV03 tv) {
        this.tv = tv;
    }

    @Override
    public void open() {
        this.tv.play();
    }
}

class ChuangWei implements ITV03 {

    @Override
    public void play() {
        System.out.println("小爱同学打开创维虹电视");
    }
}
