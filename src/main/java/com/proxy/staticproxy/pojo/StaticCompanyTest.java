package com.proxy.staticproxy.pojo;

/**
 * @program: repertory
 * @description: 静态代理测试类
 * @author: tangliang
 * @create: 2019-03-14 21:39
 **/
public class StaticCompanyTest {

    public static void main(String[] args) {

        GasProxy gasProxy = new GasProxy(new XinAoGas());

        gasProxy.proxyRecharge();

    }
}
