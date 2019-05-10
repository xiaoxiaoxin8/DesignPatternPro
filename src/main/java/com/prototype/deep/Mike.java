package com.prototype.deep;

import java.io.Serializable;

/**
 * @program: repertory
 * @description: 麦克风 最小音量为0，最大音量为100
 * @author: tangliang
 * @create: 2019-05-10 22:12
 **/
public class Mike implements Serializable {

    private Integer volume = 20;

    public Mike(){}

    public Mike(Integer volume){
        this.volume = volume < 0 ? 0 :volume;
    }

    public Integer subVolume(int vol){
        return this.volume - vol >= 0 ? this.volume - vol : this.volume;
    }

    public Integer addVolume(int vol){
        return this.volume + vol <= 100 ? this.volume + vol : this.volume;
    }

}
