package com.design.pattern.openclose;

/**
 * @ClassName: OpenClose01
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
public class OpenClose01 {

    public static void main(String[] args) {
        SendMsg sendMsg = new SendMsg();
        sendMsg.send(new Email());
        sendMsg.send(new WeiXin());
    }

}
/**
 * 如果需要新增发送手机短信消息，那么提供需要新增一个类
 * 使用方也需要新增消息发送的判断和消息发送的代码
 * 对于开闭原则来讲 对扩展开放(提供方)，对修改关闭(使用方)。 已经不满足此条件，因为使用方的修改已经打开了
 * 遵循开闭原则的改进类OpenClose02
 */

/***********以下是使用方***************/
class SendMsg{

    public void send(BaseMsg baseMsg){
        if (baseMsg.msg_type == 1) {
            sendEmail(baseMsg);
        }else if(baseMsg.msg_type == 2){
            sendWeiXin(baseMsg);
        }
    }

    public void sendEmail(BaseMsg baseMsg){
        System.out.println("发送电子邮件。。。。。。。。。。。。。。。。。");
    }

    public void sendWeiXin(BaseMsg baseMsg){
        System.out.println("发送微信消息。。。。。。。。。。。。。。。。。。");
    }
}


/***********以下是提供方***************/
/**
 * 基类
 */
class BaseMsg{
    int msg_type;
}

/**
 * 邮件
 */
class Email extends BaseMsg{

    Email(){
        super.msg_type = 1;
    }
}

/**
 * 微信
 */
class WeiXin extends BaseMsg{

    WeiXin(){
        super.msg_type = 2;
    }
}

