package com.factoryMethod;

import com.factoryMethod.pojo.Banana;
import com.factoryMethod.pojo.Fruit;

/**
 * @program: DesignPatternPro
 * @description: 香蕉工厂
 * @author: tangliang
 * @create: 2019-03-08 23:14
 **/
public class BananaFactory implements FruitFactory{
    public Fruit create() {
        return new Banana();
    }
}
