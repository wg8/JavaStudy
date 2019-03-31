package com.wg8.gof23.factory.simplefactory;

/**
 * @author Harry
 * @date 2019/3/31 10:52 PM
 */
public class Client {

    public static void main(String[] args) {

        // 非工厂模式
        Car car1 = new Audi();
        Car car2 = new Byd();
        car1.run();
        car2.run();
        System.out.println("==============分隔线=============");

        // 简单工厂模式一
        Car car3 = CarFactory01.createCar01("奥迪");
        Car car4 = CarFactory01.createCar01("比亚迪");
        car3.run();
        car4.run();
        System.out.println("==============分隔线=============");

        // 简单工厂模式二
        // 简单工厂模式一
        Car car5 = CarFactory02.createAudi();
        Car car6 = CarFactory02.createByd();
        car5.run();
        car6.run();
    }
}
