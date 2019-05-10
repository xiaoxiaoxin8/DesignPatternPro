package com.prototype.simple;

/**
 * @program: repertory
 * @description: 房间Bean
 * @author: tangliang
 * @create: 2019-05-09 21:57
 **/
public class RoomBean implements Prototype{

    private String bed;
    private String chair;
    private String tv;
    private String table;

    public RoomBean(){

    }

    public RoomBean(String bed, String chair, String tv, String table){
        this.bed = bed;
        this.chair = chair;
        this.tv = tv;
        this.table = table;
    }
    public Object clone() {
        RoomBean room = new RoomBean();
        room.setBed(this.getBed());
        room.setChair(this.getChair());
        room.setTable(this.getTable());
        room.setTv(this.getTv());
        return room;
    }

    public String getBed() {
        return bed;
    }

    public void setBed(String bed) {
        this.bed = bed;
    }

    public String getChair() {
        return chair;
    }

    public void setChair(String chair) {
        this.chair = chair;
    }

    public String getTv() {
        return tv;
    }

    public void setTv(String tv) {
        this.tv = tv;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }
}
