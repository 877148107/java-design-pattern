package com.design.pattern;

/**
 * @ClassName: Command
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/5/26 23:16
 * @Version: V1.0
 */
public interface Command {

    /**
     * 执行操作
     */
    void execute();

    /**
     * 撤销操作
     */
    void undo();
}
