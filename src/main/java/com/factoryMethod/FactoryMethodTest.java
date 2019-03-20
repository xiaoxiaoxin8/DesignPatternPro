package com.factoryMethod;

import com.factoryMethod.pojo.Banana;
import com.factoryMethod.pojo.Fruit;
import com.factoryMethod.pojo.Orange;

/**
 * @program: DesignPatternPro
 * @description: 工厂方法测试类
 * @author: tangliang
 * @create: 2019-03-08 23:17
 **/
public class FactoryMethodTest {

    /**
     * 工厂方法模式
     * 优点：在简单工厂的基础上将工厂抽象出来，每创建一个工厂都实现该接口
     * 加强了可扩展性
     * 缺点：每增加一种产品都要创建一个工厂，增加的工程的复杂度
     * @param args
     */
    public static void main(String[] args){
        FruitFactory bananaFactory = new BananaFactory();
        FruitFactory orangeFactory = new OrangeFactory();
        //生产一个橘子
        Fruit orange = orangeFactory.create();
        orange.name();

        //生产一个香蕉
        Fruit banana = bananaFactory.create();
        banana.name();
    }
}
