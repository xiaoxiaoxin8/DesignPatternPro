package com.prototype.deep;

import org.omg.CORBA.Object;
import sun.management.jmxremote.SingleEntryRegistry;

import java.io.*;

/**
 * @program: repertory
 * @description: 歌手
 * @author: tangliang
 * @create: 2019-05-10 22:12
 **/
public class Singer implements Cloneable, Serializable   {

    private String sname;
    private Mike mike;

    public Singer(String sname) {
        this.sname = sname;
    }

    public Singer(String sname, Mike mike) {
        this.sname = sname;
        this.mike = mike;
    }

    public Singer() {

    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Mike getMike() {
        return mike;
    }

    public void setMike(Mike mike) {
        this.mike = mike;
    }

    public Singer deepClone(){
        try{
            //通过二进制将对象输出到磁盘，再将文件加载到内存成为一个新的对象
            OutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream outputStream = new ObjectOutputStream(bos);
            outputStream.writeObject(this);

            InputStream ios = new ByteArrayInputStream(((ByteArrayOutputStream) bos).toByteArray());
            ObjectInputStream inputStream = new ObjectInputStream(ios);
            Singer copy = (Singer)inputStream.readObject();

            return copy;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


    public Singer clone(){
        Singer copy = new Singer(this.sname,this.mike);
        return copy;
    }
}
