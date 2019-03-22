package com.observerpattern.v1;


import java.util.Observable;

/**
 * @program: repertory
 * @description: 咕泡社区
 * @author: tangliang
 * @create: 2019-03-21 22:13
 **/
public class GPer extends Observable {

    private String name = "咕泡";

    private static GPer gper = null;

    private GPer(){}

    public static GPer getInstance(){
        if(gper == null){
            gper = new GPer();
        }
        return gper;
    }

    public void publishObserver(Question question){
        System.out.println(this.name +"正在发布消息");
        this.setChanged();
        this.notifyObservers(question);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
