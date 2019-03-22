package com.observerpattern.v2;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.observerpattern.v1.Question;

/**
 * @program: repertory
 * @description: 咕泡社区
 * @author: tangliang
 * @create: 2019-03-22 21:21
 **/
public class GuavaGPer extends EventBus {

    private String name = "咕泡";

    private static GuavaGPer guavaGPer = null;

    private GuavaGPer() {
    }

    public static GuavaGPer getInstance(){
        if(guavaGPer == null){
            guavaGPer = new GuavaGPer();
        }
        return guavaGPer;
    }

    public Question publishQuestion(Question question){
        System.out.println(this.name +" 正在发布了问题："+question.getContent());
        return question;
    }
}
