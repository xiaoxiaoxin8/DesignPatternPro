package com.abstarctFactory;

import com.abstarctFactory.pojo.HWComputer;
import com.abstarctFactory.pojo.HWMP3;
import com.abstarctFactory.pojo.HWPhone;

/**
 * @program: DesignPatternPro
 * @description: 华为工厂
 * @author: tangliang
 * @create: 2019-03-08 23:46
 **/
public class HWFactory implements EleFactory {
    public HWMP3 createMP3() {
        return new HWMP3();
    }

    public Phone createPhone() {
        return new HWPhone();
    }

    public Computer createComputer() {
        return new HWComputer();
    }
}
