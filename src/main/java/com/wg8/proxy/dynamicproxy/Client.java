package com.wg8.proxy.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * @author Harry
 * @date 2019/4/2 10:23 PM
 */
public class Client {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        StarHandler starHandler = new StarHandler(realStar);
        Star proxyStar = (Star) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Star.class}, starHandler);
        proxyStar.bookTicket();
        proxyStar.sing();

    }
}
