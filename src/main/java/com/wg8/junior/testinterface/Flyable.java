package com.wg8.junior.testinterface;

/**
 * @author Harry
 * @date 2019/3/30 5:28 PM
 */
public interface Flyable {

    int MAX_SPEED = 11000;
    int MIN_HIGHT = 1;

    void fly();
}

interface Attack {
    void attack();
}

class Plane implements Flyable {

    @Override
    public void fly() {
        System.out.println("飞机依靠发动机在飞");
    }
}

class Man implements Flyable {

    @Override
    public void fly() {
        System.out.println("跳起来飞");
    }
}

class Stone implements Flyable,Attack {

    @Override
    public void fly() {
        System.out.println("被人扔出去");
    }

    @Override
    public void attack() {
        System.out.println("石头攻击");
    }
}