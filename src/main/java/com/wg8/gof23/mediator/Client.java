package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 10:15 PM
 */
public class Client {

    public static void main(String[] args) {

        Mediator m = new President();

        Market market = new Market(m);
        Development devp = new Development(m);
        Finacial f = new Finacial(m);

        market.selfAction();
        market.outAction();
    }
}
