package com.singleton.huangry;

/**
 * @program: repertory
 * @description: 饿汉式单例
 * @author: tangliang
 * @create: 2019-03-11 12:31
 **/
public class HuangrySingleton {

    private static final HuangrySingleton huangrySingleton = new HuangrySingleton();

    private  HuangrySingleton(){};

    public static HuangrySingleton getInstance(){
        return huangrySingleton;
    }
}
