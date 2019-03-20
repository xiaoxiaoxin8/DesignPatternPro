package com.strategy.pay;

import com.strategy.pojo.Order;

/**
 * @program: repertory
 * @description: 支付接口
 * @author: tangliang
 * @create: 2019-03-15 20:51
 **/
public interface Payment {

    /**
     * 支付订单金额
     * @param order 订单对象
     * @param payType 支付方式
     */
    void pay(Order order,String payType);
}
