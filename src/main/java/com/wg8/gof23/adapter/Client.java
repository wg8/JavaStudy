package com.wg8.gof23.adapter;

/**
 * @author Harry
 * @date 2019/4/1 10:53 PM
 * 客户端类
 */
public class Client {

    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        Client client = new Client();
        Target t = new Adapter();
        client.test1(t);
    }

    private static void test2() {
        Client client = new Client();
        Target t = new Adapter2(new Adaptee());
        client.test1(t);
    }
}
