package com.wg8.gof23.factory.factorymethod;

/**
 * @author Harry
 * @date 2019/4/1 9:01 PM
 */
public class BydFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Byd();
    }
}
