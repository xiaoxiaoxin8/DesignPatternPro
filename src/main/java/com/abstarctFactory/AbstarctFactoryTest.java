package com.abstarctFactory;

import com.abstarctFactory.pojo.Computer;
import com.abstarctFactory.pojo.MP3;
import com.abstarctFactory.pojo.Phone;

/**
 * @program: DesignPatternPro
 * @description: 抽象工厂设计测试类
 * @author: tangliang
 * @create: 2019-03-08 23:32
 **/
public class AbstarctFactoryTest {


    /**
     * 抽象工厂
     * 优点：把每一种产品抽象为一个接口，把每一个工厂比作产品族可生产该品牌的产品，
     * 每增加一个品牌只需要实现该工厂接口，更加方便开发
     * 缺点：违反了开闭原则，增加了系统的抽象性和理解难度
     * @param args
     */
    public static void main(String[] args){
        //获取一个华为工厂
        HWFactory hwFactory = new HWFactory();
        //生产电脑
        Computer computer = hwFactory.createComputer();
        computer.netPlay();

        //生产MP3
        MP3 mp3 = hwFactory.createMP3();
        mp3.play();

        //生产手机
        Phone phone = hwFactory.createPhone();
        phone.bootStrap();
    }
}
