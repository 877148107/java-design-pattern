package com.design.pattern.source;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: DispatcherServlet
 * =================================================
 * @Description: TODO
 * =================================================
 * CreateInfo:
 * @Author: William.Wangmy
 * @Email: wangmingyong2018@163.com
 * @CreateDate: 2020/4/10 23:27
 * @Version: V1.0
 */
public class DispatcherServlet {

    /**
     * 所有的适配器adapter
     */
    List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    /**
     * 构造方法把所有的适配器adapter加入到内存中
     */
    public DispatcherServlet(){
        handlerAdapters.add(new SimpleControllerHandlerAdapter());
        handlerAdapters.add(new HttpRequestHandlerAdapter());
    }

    /**
     * 模拟SpringMvc的controller方法调用
     */
    public void doDispatch(){
        //模拟SpringMVC从request取handler的对象
        Controller controller = getHandler();
        //获取到对应的适配器
        HandlerAdapter adapter = getHandlerAdapter(controller);
        //通过适配器指定controller方法
        adapter.handle(controller);
    }

    /**
     * 获取适配器
     * @param controller
     * @return
     */
    private HandlerAdapter getHandlerAdapter(Controller controller) {
        if (this.handlerAdapters != null) {
            for (HandlerAdapter adapter : this.handlerAdapters) {
                if (adapter.supports(controller)) {
                    return adapter;
                }
            }
        }
        return null;
    }

    /**
     * 获取handler
     * @return
     */
    private Controller getHandler(){
        return new SimpleController();
//        return new HttpController();
    }

    public static void main(String[] args) {
        new DispatcherServlet().doDispatch();
    }
}
