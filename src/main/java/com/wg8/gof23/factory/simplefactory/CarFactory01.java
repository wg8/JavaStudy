package com.wg8.gof23.factory.simplefactory;

/**
 * @author Harry
 * @date 2019/3/31 10:54 PM
 */
public class CarFactory01 {

    public static Car createCar01(String type) {
        if ("奥迪".equals(type)) {
            return new Audi();
        } else if ("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }

}
