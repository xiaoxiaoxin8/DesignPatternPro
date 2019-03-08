package com.simpleFactory;

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
     * @param apple "apple"字符串
     * @return
     */
    public Apple createApple(String apple){
        if("apple".equals(apple)){
            return new Apple();
        }else{
            return null;
        }
    }

    /**
     * 创建一个苹果对象
     * @param clazz
     * @return
     */
    public  Apple createApple(Class clazz){
        return null;//(Apple)Class.forName(clazz).newInstance();
    }
}
