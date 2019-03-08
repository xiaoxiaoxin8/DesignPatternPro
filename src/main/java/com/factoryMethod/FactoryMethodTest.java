package com.factoryMethod;

import com.factoryMethod.pojo.Banana;
import com.factoryMethod.pojo.Orange;

/**
 * @program: DesignPatternPro
 * @description: 工厂功法测试类
 * @author: tangliang
 * @create: 2019-03-08 23:17
 **/
public class FactoryMethodTest {

    public static void main(String[] args){
        FruitFactory bananaFactory = new BananaFactory();
        FruitFactory orangeFactory = new OrangeFactory();
        //生产一个橘子
        Orange orange = (Orange) orangeFactory.createFruit();
        //生产一个香蕉
        Banana banana = (Banana) bananaFactory.createFruit();

        System.out.println("香蕉："+banana);
        System.out.println("橘子："+orange);
    }
}
