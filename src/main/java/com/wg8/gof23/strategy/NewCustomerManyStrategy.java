package com.wg8.gof23.strategy;

/**
 * @author Harry
 * @date 2019/4/18 10:19 PM
 */
public class NewCustomerManyStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("打九折");
        return standardPrice * 0.9;
    }
}
