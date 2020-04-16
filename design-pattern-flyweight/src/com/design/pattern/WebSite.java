package com.design.pattern;

import java.util.HashMap;

/**
 * 享元抽象类
 */
public abstract class WebSite {

    public abstract void publish(User user);
}

/**
 * 具体的享元角色
 */
class ConcreateWebSite extends WebSite{

    /**
     * 共享部分，内部状态
     */
    private String type = "";

    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void publish(User user) {
        System.out.println(user.getName()+"使用"+type+"进行发布。。。。。。");
    }
}

class WebSitFactory{

    /**
     * 集合，充当容器池
     */
    HashMap<String,ConcreateWebSite> pool = new HashMap<String,ConcreateWebSite>();


    public WebSite getWebSiteByType(String type){
        if (!pool.containsKey(type)) {
            pool.put(type,new ConcreateWebSite(type));
        }
        return (WebSite) pool.get(type);
    }

    public int getWebSiteCount(){
        return pool.size();
    }
}


