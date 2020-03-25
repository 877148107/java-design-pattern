package com.design.pattern.openclose.improve;

/**
 * @ClassName: OpenClose02
 * =================================================
 * @Description: Java设计模式开闭原则
 * 1) 开闭原则（Open Closed Principle）是编程中最基础、最重要的设计原则
 * 2) 一个软件实体如类，模块和函数应该对扩展开放(对提供方)，对修改关闭(对使用方)。用抽象构建框架，用实现扩展细节。
 * 3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
 * 4) 编程中遵循其它原则，以及使用设计模式的目的就是遵循开闭原则。
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/25 22:08
 * @Version: V1.0
 */
public class OpenClose02 {

    public static void main(String[] args) {
        SendMsg sendMsg = new SendMsg();
        sendMsg.send(new Email());
        sendMsg.send(new WeiXin());
        sendMsg.send(new Phone());
    }

}

/**
 * 当需要新增一个发送消息的类时，只需要添加一个类继承抽象基础类即可，使用方不用做任何修改
 */

/***********以下是使用方***************/
class SendMsg{

    public void send(BaseMsg baseMsg){
        baseMsg.send();
    }
}


/***********以下是提供方***************/

/**
 * 基类
 * 抽象类，提供一个发送消息的抽象方法
 */
abstract class BaseMsg{
    int msg_type;

    /**
     * 发送消息
     */
    public abstract void send();
}

/**
 * 邮件
 */
class Email extends BaseMsg {

    Email(){
        super.msg_type = 1;
    }

    @Override
    public void send() {
        System.out.println("发送电子邮件。。。。。。。。。。。。。。。。。");
    }
}

/**
 * 微信
 */
class WeiXin extends BaseMsg {

    WeiXin(){
        super.msg_type = 2;
    }

    @Override
    public void send() {
        System.out.println("发送微信消息。。。。。。。。。。。。。。。。。。");
    }
}

/**
 * 短信
 */
class Phone extends BaseMsg{

    Phone(){
        super.msg_type = 3;
    }

    @Override
    public void send() {
        System.out.println("发送短信消息。。。。。。。。。。。。。。。。。。");
    }
}

