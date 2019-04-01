package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:18 PM
 */
public class LuxuryCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuxuryEngine();
    }

    @Override
    public Seat createSeat() {
        return new LuxurySeat();
    }

    @Override
    public Tyre createTyre() {
        return new LuxuryTyre();
    }
}
