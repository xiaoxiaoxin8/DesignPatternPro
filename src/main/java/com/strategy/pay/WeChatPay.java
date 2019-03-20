package com.strategy.pay;

import com.strategy.pojo.Order;

/**
 * @program: repertory
 * @description: 微信支付
 * @author: tangliang
 * @create: 2019-03-15 21:00
 **/
public class WeChatPay implements Payment{
    public void pay(Order order,String payType) {
        order.setPayType(payType);
        //业务逻辑
        System.out.println("运行"+payType+"支付的逻辑");
    }
}
