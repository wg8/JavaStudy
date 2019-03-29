package com.wg8.gof23.singleton;

/**
 * @author Harry
 * @date 2019/3/28 12:47 AM
 */
public class ClientTest {

    public static void main(String[] args) {

        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        System.out.println("==============================");

        SingletonDemo2 s3 = SingletonDemo2.getInstance();
        SingletonDemo2 s4 = SingletonDemo2.getInstance();
        System.out.println(s3);
        System.out.println(s4);
        System.out.println("==============================");

        SingletonDemo3 s5 = SingletonDemo3.getInstance();
        SingletonDemo3 s6 = SingletonDemo3.getInstance();
        System.out.println(s5);
        System.out.println(s6);
        System.out.println("==============================");

        System.out.println(SingletonDemo4.INSTANCE == SingletonDemo4.INSTANCE);

    }
}
