package com.design.pattern.abstractfactory.factory;

import com.design.pattern.abstractfactory.pizza.Pizza;

/**
 * 抽象工厂接口
 */
public interface AbstractFactory {

    /**
     * 让子类实现
     * @param orderType
     * @return
     */
    Pizza createPizza(String orderType);
}
