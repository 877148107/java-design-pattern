package com.design.pattern;

/**
 * @ClassName: CommandClient
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/5/26 23:32
 * @Version: V1.0
 */
public class CommandClient {

    public static void main(String[] args) {
        //使用命令模式，通过遥控操作电灯
        LightReceiver lightReceiver = new LightReceiver();

        //创建电灯开关
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);

        //创建遥控器
        RemoteController remoteController = new RemoteController();
        remoteController.setCommand(0,lightOnCommand,lightOffCommand);
        System.out.println("==================打开======================");
        remoteController.onButtonWasPushed(0);
        System.out.println("==================关闭======================");
        remoteController.offButtonWasPushed(0);
        System.out.println("==================撤销======================");
        remoteController.undoButtonWasPushed(0);
    }
}
