package com.adapter;

/**
 * @program: repertory
 * @description: JSON通信并且系统需要兼容XML通信服务
 * @author: tangliang
 * @create: 2019-03-21 21:06
 **/
public class CommunicationJSON extends CommunicationXML{

    @Override
    public Object doPost(String json) {
        String xml = JSON2XML(json);
        return super.doPost(xml);
    }

    public String JSON2XML(String json){
        return "";
    }
}
