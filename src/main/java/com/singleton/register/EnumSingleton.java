package com.singleton.register;

/**
 * 利用枚举类型创建单例
 * 实际上也是饿汉式，只不过枚举这个类型JDK做了特殊的处理
 * 可以避免序列化和普通反射来破坏单例
 * （严格来讲所有单例通过反射机制都可以被破坏）
 */
public enum EnumSingleton {
    INSTANCE;

    private Object data;

    public void setData(Object data){this.data = data;}

    public Object getData(){return this.data;}

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
