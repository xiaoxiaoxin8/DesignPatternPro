package com.observerpattern.v1;

/**
 * @program: repertory
 * @description: 问题实体类
 * @author: tangliang
 * @create: 2019-03-21 22:16
 **/
public class Question {

    private String content;
    private String  title;

    public Question(String content) {
        this.content = content;
    }

    public Question(String content, String title) {
        this.content = content;
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
