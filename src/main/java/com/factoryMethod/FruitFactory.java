package com.factoryMethod;

import com.factoryMethod.pojo.Fruit;

/**
 * @program: DesignPatternPro
 * @description: 水果工厂接口
 * @author: tangliang
 * @create: 2019-03-08 22:38
 **/
public interface FruitFactory {

    public Fruit create();
}
