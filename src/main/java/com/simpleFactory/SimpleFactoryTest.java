package com.simpleFactory;

import com.simpleFactory.pojo.Apple;

/**
 * @program: DesignPatternPro
 * @description: 简单工厂测试类
 * @author: tangliang
 * @create: 2019-03-08 22:15
 **/
public class SimpleFactoryTest {

    /**
     * 简单工厂 <br/>
     * 优点：逻辑简单，省去了创建复杂对象的繁琐过程
     * 缺点：可扩展性差,不易于扩展复杂的产品结构
     * @param args
     */
    public static void main(String[] args){
        //传入字符串生产一个苹果
        String str = "apple";
        AppleFactory appleFactory = new AppleFactory();
        Apple apple = (Apple)appleFactory.createApple(str);
        apple.name();

        //反射创建一个苹果对象
        Apple applle2 = (Apple)appleFactory.createApple(Apple.class);
        applle2.name();
    }

}
