package com.strategy;

import com.strategy.pay.AliPay;
import com.strategy.pay.Payment;
import com.strategy.pojo.Order;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: repertory
 * @description: 支付策略
 * @author: tangliang
 * @create: 2019-03-15 20:50
 **/
public class PayStrategy {

    public void pay(Order order,String payType){
        Payment payment = (Payment) PayFactory.getInstance(payType);
        payment.pay(order,payType);
    }
}
