package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:18 PM
 */
public class LowCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LowEngine();
    }

    @Override
    public Seat createSeat() {
        return new LowSeat();
    }

    @Override
    public Tyre createTyre() {
        return new LowTyre();
    }
}
