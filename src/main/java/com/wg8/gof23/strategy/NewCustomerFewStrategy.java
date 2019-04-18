package com.wg8.gof23.strategy;

/**
 * @author Harry
 * @date 2019/4/18 10:19 PM
 */
public class NewCustomerFewStrategy implements Strategy {
    @Override
    public double getPrice(double standardPrice) {
        System.out.println("不打折，原价");
        return standardPrice;
    }
}
