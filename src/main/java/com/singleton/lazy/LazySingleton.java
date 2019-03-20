package com.singleton.lazy;

/**
 * @program: repertory
 * @description: 懒汉式单例
 * @author: tangliang
 * @create: 2019-03-11 12:35
 **/
public class LazySingleton {

    private  static LazySingleton lazySingleton = null;

    private LazySingleton(){}

    /**
     * 线程不安全
     */
    public static LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
