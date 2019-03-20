package com.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @program: repertory
 * @description: Spring中实现注册式单例模拟
 * @author: tangliang
 * @create: 2019-03-12 00:19
 **/
public class ContainerSingleton {
    private ContainerSingleton(){}

    public static Map ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        synchronized (ioc){
            if(!ioc.containsKey(className)){
                Object obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
                return obj;
            }
        }
        return ioc.get(className);
    }
}
