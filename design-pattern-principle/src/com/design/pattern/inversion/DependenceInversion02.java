package com.design.pattern.inversion;

/**
 * @ClassName: DependenceInversion02
 * =================================================
 * @Description: Java设计模式依赖倒置原则
 * 依赖倒转原则(Dependence Inversion Principle)是指：
 * 1) 高层模块不应该依赖低层模块，二者都应该依赖其抽象（抽象类或者接口，不要依赖具体的子类）
 * 2) 抽象不应该依赖细节，细节应该依赖抽象
 * 3) 依赖倒转(倒置)的中心思想是面向接口编程
 * 4) 依赖倒转原则是基于这样的设计理念：相对于细节的多变性，抽象的东西要稳定的多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在java中，抽象指的是接口或抽象类，细节就是具体的实现类
 * 5) 使用接口或抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的 任务交给他们的实现类去完成
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/3/24 21:06
 * @Version: V1.0
 */
public class DependenceInversion02 {

    public static void main(String[] args) {
        //一个person发送邮件
        Person person = new Person();
        person.send(new Email());
        person.send(new WeiXin());
    }
}

/**
 * 定义一个消息发送接口
 */
interface ISendMsg{
    public String sendMsg();
}

class Email implements ISendMsg{
    @Override
    public String sendMsg(){
        return "邮件消息：Hello java pattern！";
    }
}

class WeiXin implements ISendMsg{
    @Override
    public String sendMsg(){
        return "微信消息：Hello java pattern！";
    }
}

class Person{
    public void send(ISendMsg sendMsg){
        System.out.println(sendMsg.sendMsg());
    }
}


