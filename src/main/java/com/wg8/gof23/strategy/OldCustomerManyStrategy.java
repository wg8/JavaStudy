package com.wg8.gof23.strategy;

/**
 * @author Harry
 * @date 2019/4/18 10:20 PM
 */
public class OldCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打八折");
        return standardPrice * 0.8;

    }
}
