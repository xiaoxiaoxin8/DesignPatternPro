package com.observerpattern.v1;

import java.util.Observable;
import java.util.Observer;

/**
 * @program: repertory
 * @description: 观察者
 * @author: tangliang
 * @create: 2019-03-21 22:15
 **/
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public void update(Observable o, Object arg) {
        GPer gper = (GPer) o;
        Question question = (Question)arg;
        System.out.println(gper.getName()+",出现问题"+
                question.getContent()+",老师"+this.name+"马上赶往现场");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
