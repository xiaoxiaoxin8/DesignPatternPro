package com.strategy.pojo;

/**
 * @program: repertory
 * @description: 订单
 * @author: tangliang
 * @create: 2019-03-15 20:52
 **/
public class Order {
    private String id;//订单编号
    private String goodsId;//商品编号
    private String state;//订单状态
    private double money;//交易金额
    private String payType; //支付类型

    public Order(String id,String goodsId,String state,double money){
        this.id = id;
        this.goodsId = goodsId;
        this.money = money;
        this.state = state;
    }

    public Order(String payType){
        this.payType = payType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getPayType() {
        return payType;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }
}
