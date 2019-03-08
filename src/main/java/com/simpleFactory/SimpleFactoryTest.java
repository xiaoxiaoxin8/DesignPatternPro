package com.simpleFactory;

import com.simpleFactory.pojo.Apple;

/**
 * @program: DesignPatternPro
 * @description: 简单工厂测试类
 * @author: tangliang
 * @create: 2019-03-08 22:15
 **/
public class SimpleFactoryTest {

    public static void main(String[] args){
        //生产一个苹果
        String str = "apple";
        AppleFactory appleFactory = new AppleFactory();
        Apple apple = appleFactory.createApple(str);

        System.out.println(apple);
    }

}
