package com.wg8.gof23.factory.abstractfactory;

/**
 * @author Harry
 * @date 2019/4/1 9:13 PM
 */
public interface Engine {

    void run();
    void start();
}


class LuxuryEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转的快！");
    }

    @Override
    public void start() {
        System.out.println("启动快!可以自动启停！");
    }

}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("转的慢！");
    }

    @Override
    public void start() {
        System.out.println("启动慢!");
    }

}
