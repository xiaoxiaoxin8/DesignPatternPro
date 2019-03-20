package com.strategy;

import com.strategy.pojo.Order;

/**
 * @program: repertory
 * @description: 策略模式测试类
 * @author: tangliang
 * @create: 2019-03-15 23:54
 **/
public class PayTest {
    public static void main(String[] args) {
        PayStrategy payStrategy = new PayStrategy();
        Order order = new Order(PayTypeInterface.ALI_PAY);
        payStrategy.pay(order,PayTypeInterface.ALI_PAY);
        System.out.println(order.getPayType());
    }
}
