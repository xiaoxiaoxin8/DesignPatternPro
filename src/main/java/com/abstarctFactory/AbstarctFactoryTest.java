package com.abstarctFactory;

/**
 * @program: DesignPatternPro
 * @description: 抽象工厂设计测试类
 * @author: tangliang
 * @create: 2019-03-08 23:32
 **/
public class AbstarctFactoryTest {

    public static void main(String[] args){
        //获取一个华为工厂
        HWFactory hwFactory = new HWFactory();
        hwFactory.createComputer();
        hwFactory.createMP3();
        hwFactory.createPhone();
    }
}
