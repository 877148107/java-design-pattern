package com.design.pattern;

/**
 * @ClassName: RemoteController
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/5/26 23:21
 * @Version: V1.0
 */
public class RemoteController {

    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;

    /**
     * 构造方法，五组开关
     */
    public RemoteController() {
        onCommands = new Command[5];
        offCommands = new Command[5];
        //构造空命令，避免空判断
        for (int i = 0; i < 5; i++) {
            onCommands[i] = new NoCommand();
            offCommands[i] = new NoCommand();
        }
    }

    /**
     * 给按钮设置需要发送的命令
     * @param no
     * @param onCommand
     * @param offCommand
     */
    public void setCommand(int no,Command onCommand,Command offCommand){
        onCommands[no] = onCommand;
        offCommands[no] = offCommand;
    }

    /**
     * 按下开按钮
     * @param no
     */
    public void onButtonWasPushed(int no){
        onCommands[no].execute();
        undoCommand = onCommands[no];
    }

    /**
     * 按下关按钮
     * @param no
     */
    public void offButtonWasPushed(int no){
        offCommands[no].execute();
        undoCommand = offCommands[no];
    }

    /**
     * 按下撤销按钮
     * @param no
     */
    public void undoButtonWasPushed(int no){
        undoCommand.undo();
    }
}
