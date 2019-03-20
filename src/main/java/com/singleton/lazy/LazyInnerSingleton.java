package com.singleton.lazy;

/**
 * @program: repertory
 * @description: 静态内部类实现单例
 * @author: tangliang
 * @create: 2019-03-11 12:52
 **/
public class LazyInnerSingleton {

    /**
     * 内部类实现单例
     * 内部类中是饿汉式，静态内部类会在被调用是加载
     */
    private LazyInnerSingleton(){
        /**
         * 应用中避免被反射机制创建，破坏单例
         */
        if(LazyInnerSingletonInner.lazyInnerSingleton != null){
            throw new RuntimeException("不能再创建该实例");
        }
    }

    private static class LazyInnerSingletonInner{
        private LazyInnerSingletonInner(){};
        final static LazyInnerSingleton lazyInnerSingleton = new LazyInnerSingleton();
    }

    public static LazyInnerSingleton getInstance(){
        return LazyInnerSingletonInner.lazyInnerSingleton;
    }

}
