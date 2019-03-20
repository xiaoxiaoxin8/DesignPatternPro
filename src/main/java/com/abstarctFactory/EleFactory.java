package com.abstarctFactory;

import com.abstarctFactory.pojo.Computer;
import com.abstarctFactory.pojo.MP3;
import com.abstarctFactory.pojo.Phone;

/**
 * @program: DesignPatternPro
 * @description: 电子产品工厂接口
 * @author: tangliang
 * @create: 2019-03-08 23:25
 **/
public interface EleFactory {
    /**
     * 生产一个MP3
     * @return
     */
    public MP3 createMP3();

    /**
     * 生产手机
     * @return
     */
    public Phone createPhone();

    /**
     * 生产一台电脑
     * @return
     */
    public Computer createComputer();
}
