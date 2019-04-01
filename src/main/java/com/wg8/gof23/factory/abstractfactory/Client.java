package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:19 PM
 */
public class Client {

    public static void main(String[] args) {
        CarFactory factory = new LuxuryCarFactory();
        Engine e = factory.createEngine();
        e.run();
        e.start();
    }
}
