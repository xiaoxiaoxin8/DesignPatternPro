package com.strategy.pay;

import com.strategy.pojo.Order;

/**
 * @program: repertory
 * @description: 会员卡支付
 * @author: tangliang
 * @create: 2019-03-15 23:27
 **/
public class VipPay implements Payment {
    public void pay(Order order, String payType) {
        order.setPayType(payType);
        //会员卡支付逻辑
        System.out.println("运行"+payType+"支付逻辑");
    }
}
