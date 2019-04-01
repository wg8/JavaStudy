package com.wg8.gof23.factory.factorymethod;

/**
 * @author Harry
 * @date 2019/4/1 9:05 PM
 */
public class BenzFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Benz() ;
    }
}
