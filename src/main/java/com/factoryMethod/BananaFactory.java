package com.factoryMethod;

import com.factoryMethod.pojo.Banana;

/**
 * @program: DesignPatternPro
 * @description: 香蕉工厂
 * @author: tangliang
 * @create: 2019-03-08 23:14
 **/
public class BananaFactory implements FruitFactory{
    public Banana createFruit() {
        return new Banana();
    }
}
