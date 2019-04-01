package com.wg8.gof23.factory.factorymethod;

/**
 * @author Harry
 * @date 2019/4/1 9:00 PM
 */
public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
