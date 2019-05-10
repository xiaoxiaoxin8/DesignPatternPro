package com.prototype.simple;

/**
 * @program: repertory
 * @description: 浅克隆测试
 * @author: tangliang
 * @create: 2019-05-09 22:12
 **/
public class PrototypeTest {

    public static void main(String[] args) {
        RoomBean bean = new RoomBean("大床","大椅子","大桌子","大电视");

        RoomBean bean2 = (RoomBean)bean.clone();

        System.out.println(bean == bean2);
    }
}
