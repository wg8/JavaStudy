package com.wg8.gof23.prototype;

import java.util.Date;

/**
 * @author Harry
 * @date 2019/4/1 10:16 PM
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        test3();
    }


    private static void test1() throws CloneNotSupportedException {

        Date date = new Date(12312321331L);
        // 原型羊
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1);
        System.out.println(s1.getName());
        System.out.println(s1.getBirthday());

        // 克隆羊，对象地址不一样，但是属性内容都相同
        Sheep s2 = (Sheep) s1.clone();
        System.out.println(s2);
        System.out.println(s2.getName());
        System.out.println(s2.getBirthday());

        Sheep s3 = (Sheep) s1.clone();
        // 也可对 clone 以后的内容重新设置值
        s3.setName("多利");
        System.out.println(s3.getName());
        System.out.println(s3.getBirthday());

        date.setTime(23432432423L);
        Sheep s4 = (Sheep) s1.clone();
        System.out.println(s4.getName());
        System.out.println(s4.getBirthday());

    }

    /**
     * 浅复制
     */
    private static void test2() throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        // 原型羊
        Sheep s1 = new Sheep("少利", date);
        System.out.println(s1.getBirthday());
        Sheep s2 = (Sheep) s1.clone();
        // 如果此时对 date 进行重新赋值，那么 date 的值也会发生改变（期望不变），见附图，需要把原型对象的属性也进行拷贝
        date.setTime(23432432423L);
        System.out.println(s2.getBirthday());

    }

    /**
     * 深复制
     */
    private static void test3() throws CloneNotSupportedException {
        Date date = new Date(12312321331L);
        Sheep2 s1 = new Sheep2("少利", date);
        // 实现深复制。s2对象的birthday是一个新对象！
        Sheep2 s2 = (Sheep2) s1.clone();
        System.out.println(s1.getBirthday());
        // 即使设置新的时间，但是 s2 的值依旧不会发生改变¬
        date.setTime(23432432423L);
        System.out.println(s2.getBirthday());
    }

}
