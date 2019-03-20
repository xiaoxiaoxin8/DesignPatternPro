package com.singleton.lazy;

/**
 * @program: repertory
 * @description: 双重检查实现懒汉式加载、线程安全
 * @author: tangliang
 * @create: 2019-03-11 23:29
 **/
public class DoubleCheckLazySingleton {


    //避免在多线程环境下，指令的随机排序，我们加上volatile
    private volatile static DoubleCheckLazySingleton lazySingleton = null;


    /**
     * 考虑到线程安全，建议使用double check的方式
     */
    public static DoubleCheckLazySingleton getInstance(){

        //外层判断不能去掉，去掉将锁住整个类（由于是静态方法）
        if(lazySingleton == null){
            synchronized (LazySingleton.class){
                if(lazySingleton == null){
                    lazySingleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
