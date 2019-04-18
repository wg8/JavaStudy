package com.wg8.gof23.strategy;

/**
 * @author Harry
 * @date 2019/4/18 10:27 PM
 */
public class Client {

    public static void main(String[] args) {
        Strategy strategy = new OldCustomerFewStrategy();
        Context context = new Context(strategy);
        context.pringPrice(1000);
    }
}
