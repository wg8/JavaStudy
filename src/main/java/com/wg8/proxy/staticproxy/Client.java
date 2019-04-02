package com.wg8.proxy.staticproxy;

/**
 * @author Harry
 * @date 2019/4/2 9:55 PM
 */
public class Client {

    public static void main(String[] args) {

        Star real = new RealStar();
        Star proxy = new ProxyStar(real);

        proxy.confer();
        proxy.signContract();
        proxy.bookTicket();
        proxy.sing();

        proxy.collectMoney();
    }
}
