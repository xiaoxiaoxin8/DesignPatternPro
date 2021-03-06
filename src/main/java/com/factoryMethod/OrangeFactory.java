package com.factoryMethod;

import com.factoryMethod.pojo.Fruit;
import com.factoryMethod.pojo.Orange;

/**
 * @program: DesignPatternPro
 * @description: 橘子工厂
 * @author: tangliang
 * @create: 2019-03-08 23:17
 **/
public class OrangeFactory implements FruitFactory{
    public Fruit create() {
        return new Orange();
    }
}
