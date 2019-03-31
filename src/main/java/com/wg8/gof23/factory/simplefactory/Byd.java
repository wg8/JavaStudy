package com.wg8.gof23.factory.simplefactory;

/**
 * @author Harry
 * @date 2019/3/31 10:30 PM
 */
public class Byd implements Car {
    @Override
    public void run() {
        System.out.println("比亚迪在跑！");
    }
}
