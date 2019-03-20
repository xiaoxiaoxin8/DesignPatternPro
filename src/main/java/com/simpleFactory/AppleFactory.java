package com.simpleFactory;

import com.factoryMethod.pojo.Banana;
import com.factoryMethod.pojo.Fruit;
import com.simpleFactory.pojo.Apple;

/**
 * @program: DesignPatternPro
 * @description: 简单苹果生产工厂
 * @author: tangliang
 * @create: 2019-03-08 22:02
 **/
public class AppleFactory {

    /**
     * 创建一个苹果对象
     * @param fruit "apple"字符串
     * @return
     */
    public Fruit createApple(String fruit){
        //该工厂如果需要生气其他水果则添加if...else判断，显然不利于复杂产品的生产
        if("apple".equals(fruit)){
            return new Apple();
        }else if("banana".equals(fruit)){
            return new Banana();
        }else{
            return null;
        }
    }

    /**
     * 利用反射技术创建一个苹果对象
     * 相比传入字符串创建对象，反射生产可以有效降低传参错误的问题
     * @param clazz
     * @return
     */
    public  Fruit createApple(Class clazz){
        if(clazz != null){
            try {
                return (Fruit)clazz.newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
