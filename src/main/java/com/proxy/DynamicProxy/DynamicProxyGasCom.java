package com.proxy.DynamicProxy;

import com.proxy.staticproxy.pojo.GasCompany;
import com.proxy.staticproxy.pojo.GasProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @program: repertory
 * @description: 动态代理燃气充值公司
 * @author: tangliang
 * @create: 2019-03-14 21:57
 **/
public class DynamicProxyGasCom implements InvocationHandler {

    private GasCompany target;

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }

    public Object getInstance(GasCompany gasCompany){
        this.target = gasCompany;
        Class<?> clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    private void before(){
        System.out.println("代理之前请先缴手续费");
    }

    private void after(){
        System.out.println("动态代理完了，你可以走了，告辞！");
    }

}
