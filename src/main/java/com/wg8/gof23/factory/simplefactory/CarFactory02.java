package com.wg8.gof23.factory.simplefactory;

/**
 * @author Harry
 * @date 2019/3/31 11:00 PM
 */
public class CarFactory02 {

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
