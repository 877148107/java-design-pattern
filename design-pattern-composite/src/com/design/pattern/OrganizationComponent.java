package com.design.pattern;

/**
 * @ClassName: OrganizationComponent
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/14 22:15
 * @Version: V1.0
 */
public abstract class OrganizationComponent {

    private String name;

    private String desc;

    public OrganizationComponent(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    /**
     * 子类实现
     */
    public abstract void print();

    /**
     * 添加  默认实现
     * @param organizationComponent
     */
    protected void add(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    /**
     * 删除  默认实现
     * @param organizationComponent
     */
    protected void remove(OrganizationComponent organizationComponent){
        throw new UnsupportedOperationException();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
