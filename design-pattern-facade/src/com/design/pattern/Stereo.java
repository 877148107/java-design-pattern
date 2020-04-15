package com.design.pattern;

/**
 * 立体声
 */
public class Stereo {

    /**
     * 单例模式：饿汉式
     */
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("立体声打开。。。。。。");
    }
    public void off(){
        System.out.println("立体声关闭。。。。。。");
    }
    public void up(){
        System.out.println("立体声调大。。。。。。");
    }
}

/**
 * DVD
 */
class DVDPlayer {

    /**
     * 单例模式：饿汉式
     */
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("DVD打开。。。。。。");
    }
    public void off(){
        System.out.println("DVD关闭。。。。。。");
    }
    public void play(){
        System.out.println("DVD播放。。。。。。");
    }
    public void pause(){
        System.out.println("DVD暂停。。。。。。");
    }
}

/**
 * 爆米花
 */
class Popcorn {

    /**
     * 单例模式：饿汉式
     */
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("爆米花机打开。。。。。。");
    }
    public void off(){
        System.out.println("爆米花机关闭。。。。。。");
    }
}

/**
 * 屏幕
 */
class Screen {

    /**
     * 单例模式：饿汉式
     */
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("屏幕上升。。。。。。");
    }
    public void down(){
        System.out.println("屏幕下落。。。。。。");
    }
}

/**
 * 投影仪
 */
class Projector {

    /**
     * 单例模式：饿汉式
     */
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪打开。。。。。。");
    }
    public void off(){
        System.out.println("投影仪关闭。。。。。。");
    }
}

/**
 * 灯光
 */
class TheaterLight {

    /**
     * 单例模式：饿汉式
     */
    private static TheaterLight instance = new TheaterLight();

    public static TheaterLight getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("灯光打开。。。。。。");
    }
    public void off(){
        System.out.println("灯光关闭。。。。。。");
    }
    public void dim(){
        System.out.println("灯光调暗。。。。。。");
    }
    public void bright(){
        System.out.println("灯光调亮。。。。。。");
    }
}
