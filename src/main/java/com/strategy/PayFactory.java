package com.strategy;

import com.strategy.pay.AliPay;
import com.strategy.pay.Payment;
import com.strategy.pay.VipPay;
import com.strategy.pay.WeChatPay;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: repertory
 * @description: 支付方式简单工厂
 * @author: tangliang
 * @create: 2019-03-15 23:37
 **/
public class PayFactory {

    private static Map<String,Object> payTypeMap = new HashMap<String,Object>();

    static {
        payTypeMap.put(PayTypeInterface.ALI_PAY,new AliPay());
        payTypeMap.put(PayTypeInterface.VIP_PAY,new VipPay());
        payTypeMap.put(PayTypeInterface.WECHAT_PAY,new WeChatPay());
    }

    /**
     * l利用Map去掉繁琐的if...else...判断
     * @param payType
     * @return
     */
    public static Payment getInstance(String payType){
        return (Payment) payTypeMap.get(payType);
    }
}
