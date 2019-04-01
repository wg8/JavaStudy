package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:15 PM
 */
public interface Seat {
    void massage();
}

class LuxurySeat implements Seat {

    @Override
    public void massage() {
        System.out.println("可以自动按摩！");
    }

}

class LowSeat implements Seat {

    @Override
    public void massage() {
        System.out.println("不能按摩！");
    }
}
