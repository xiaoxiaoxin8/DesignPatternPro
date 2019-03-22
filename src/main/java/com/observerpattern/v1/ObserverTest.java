package com.observerpattern.v1;

/**
 * @program: repertory
 * @description: 观察者模式测试类
 * @author: tangliang
 * @create: 2019-03-21 22:42
 **/
public class ObserverTest {

    public static void main(String[] args) {
        //老师是事件监听者
        Teacher teacher = new Teacher("小小新");

        //问题是事件
        Question question = new Question("请回答1988");
        question.setTitle("测试");
        GPer gPer = GPer.getInstance();
        //添加监听
        gPer.addObserver(teacher);

        //发布问题是触发事件
        gPer.publishObserver(question);
    }
}
