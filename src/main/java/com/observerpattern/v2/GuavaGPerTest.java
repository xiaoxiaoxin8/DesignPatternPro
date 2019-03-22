package com.observerpattern.v2;

import com.google.common.eventbus.EventBus;
import com.observerpattern.v1.Question;
import com.observerpattern.v1.Teacher;

/**
 * @program: repertory
 * @description: Guava咕泡测试
 * @author: tangliang
 * @create: 2019-03-22 21:34
 **/
public class GuavaGPerTest {

    public static void main(String[] args) {
        //EventBus eventBus = new EventBus();

        //创建监听器
        GuavaTeacher teacher = new GuavaTeacher("小小新");

        GuavaGPer guavaGPer = GuavaGPer.getInstance();

        //事件
        Question question = new Question("这道题太难了，我不会！告辞");
       ;
        //注册/添加监听器
        guavaGPer.register(teacher);
        //触发事件
        guavaGPer.post(guavaGPer.publishQuestion(question));
    }
}
