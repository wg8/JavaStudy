package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:16 PM
 */
public interface CarFactory {

    Engine createEngine();

    Seat createSeat();

    Tyre createTyre();
}
