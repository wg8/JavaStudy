package com.wg8.gof23.factory.factorymethod;

/**
 * @author Harry
 * @date 2019/4/1 9:02 PM
 */
public class Client {

    public static void main(String[] args) {
        Car car1 = new AudiFactory().createCar();
        car1.run();
        Car car2 = new BydFactory().createCar();
        car2.run();

    }
}
