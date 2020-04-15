package com.design.pattern;

/**
 * @ClassName: HomeTheaterFacade
 * =================================================
 * @Description: 外观类
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/15 23:03
 * @Version: V1.0
 */
public class HomeTheaterFacade {

    /**
     * 各个子系统
     */
    private DVDPlayer dvdPlayer;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;
    private TheaterLight theaterLight;

    public HomeTheaterFacade() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
        this.theaterLight = TheaterLight.getInstance();
    }

    public void ready(){
        dvdPlayer.on();
        popcorn.on();
        projector.on();
        screen.down();
        stereo.on();
        theaterLight.on();
    }

    public void play(){
        dvdPlayer.play();
        theaterLight.dim();
    }

    public void pause(){
        dvdPlayer.pause();
    }

    public void end(){
        dvdPlayer.off();
        popcorn.off();
        projector.off();
        screen.up();
        stereo.off();
        theaterLight.off();
    }
}
