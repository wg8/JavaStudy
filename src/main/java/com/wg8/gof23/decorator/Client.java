package com.wg8.gof23.decorator;

/**
 * @author Harry
 * @date 2019/4/15 11:22 PM
 */
public class Client {

    public static void main(String[] args) {
        Car car = new Car();
        car.move();

        System.out.println("增加新的功能，飞行----------");
        FlyCar flycar = new FlyCar(car);
        flycar.move();

        System.out.println("增加新的功能，水里游---------");
        WaterCar  waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("增加两个新的功能，飞行，水里游-------");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();

    }
}
