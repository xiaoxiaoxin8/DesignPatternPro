package com.proxy.DynamicProxy;

import com.proxy.staticproxy.pojo.GasCompany;
import com.proxy.staticproxy.pojo.XinAoGas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @program: repertory
 * @description: 动态代理测试类
 * @author: tangliang
 * @create: 2019-03-14 22:09
 **/
public class DynamicProxyTest {

    public static void main(String[] args) throws IOException {

        DynamicProxyGasCom dynamicProxyGasCom = new DynamicProxyGasCom();
        GasCompany gasCompany = (GasCompany) dynamicProxyGasCom.getInstance(new XinAoGas());
        gasCompany.recharge();

        System.out.println(gasCompany);

        FileOutputStream os = new FileOutputStream("$Proxy0");
        //os.write();
    }
}
