package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:15 PM
 */
public interface Tyre {
    void revolve();
}

class LuxuryTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转不磨损！");
    }

}

class LowTyre implements Tyre {

    @Override
    public void revolve() {
        System.out.println("旋转磨损快！");
    }

}
