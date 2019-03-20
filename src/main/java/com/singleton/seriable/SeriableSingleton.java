package com.singleton.seriable;

import java.io.Serializable;

/**
 * @program: repertory
 * @description: 反序列化破坏单例案例
 * @author: tangliang
 * @create: 2019-03-12 20:59
 **/
public class SeriableSingleton implements Serializable {

    private final static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    private  Object readResolve(){
        return  seriableSingleton;
    }
}
