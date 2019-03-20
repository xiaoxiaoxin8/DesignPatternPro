package com.proxy.staticproxy.pojo;

/**
 * @program: repertory
 * @description: 燃气充值代理服务
 * @author: tangliang
 * @create: 2019-03-14 21:31
 **/
public class GasProxy {

    GasCompany gasCompany;

    public GasProxy(GasCompany gasCompany){
        this.gasCompany = gasCompany;
    }

    public void proxyRecharge(){
        before();
        gasCompany.recharge();
        after();
    }


    private void after(){

    }

    private void before(){
        System.out.println("这里是静态代理，请先缴纳手续费");
    }
}
