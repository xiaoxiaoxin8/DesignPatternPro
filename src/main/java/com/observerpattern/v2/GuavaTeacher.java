package com.observerpattern.v2;

import com.google.common.eventbus.Subscribe;
import com.observerpattern.v1.Question;

/**
 * @program: repertory
 * @description: 咕泡老师(监听器)
 * @author: tangliang
 * @create: 2019-03-22 21:35
 **/
public class GuavaTeacher {
    private String name;

    public GuavaTeacher(String name) {
        this.name = name;
    }

    @Subscribe
    public void answerQuestion(Question question){
        System.out.println(question.getContent()+"\n不方，老师"+this.name +"来给你解答");
    }
}
