package com.design.pattern;

/**
 * @ClassName: soyaMilk
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/29 21:49
 * @Version: V1.0
 */
public abstract class SoyaMilk {

    /**
     * 模板方法，豆浆制作
     * final 不让子类覆盖
     */
    public final void make(){
        select();
        add();
        soak();
        beat();
    }

    /**
     * 选材料
     */
    public abstract void select();

    /**
     * 添加不同的配料
     */
    public void add(){

    }

    /**
     * 浸泡
     */
    public void soak(){
        System.out.println("第三步：浸泡材料和配料三小时");
    }

    /**
     * 打碎
     */
    public void beat(){
        System.out.println("第四步：材料和配料放入豆浆机");
    }
}
