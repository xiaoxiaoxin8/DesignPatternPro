package com.strategy.pay;

import com.strategy.pojo.Order;

/**
 * @program: repertory
 * @description: 支付宝
 * @author: tangliang
 * @create: 2019-03-15 23:26
 **/
public class AliPay implements Payment {
    public void pay(Order order, String payType) {
        order.setPayType(payType);
        //业务逻辑
        System.out.println("运行"+payType+"支付的逻辑");
    }
}
