package com.prototype.deep;

/**
 * @program: repertory
 * @description: 深克隆测试
 * @author: tangliang
 * @create: 2019-05-10 22:33
 **/
public class DeepTest {

    public static void main(String[] args) {
        Mike mike = new Mike();
        mike.addVolume(60);
        Singer singer = new Singer("Tommy",mike);

        Singer deepClone = singer.deepClone();
        Singer clone = singer.clone();

        System.out.println(deepClone == singer);
        System.out.println(clone == singer);
        System.out.println(deepClone.getMike() == singer.getMike());
        System.out.println(clone.getMike() == singer.getMike());

    }
}
