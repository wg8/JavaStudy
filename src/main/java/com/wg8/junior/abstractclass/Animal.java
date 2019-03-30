package com.wg8.junior.abstractclass;

/**
 * @author Harry
 * @date 2019/3/30 5:06 PM
 */
public abstract class Animal {

    /**
     * 该方法可以被定义，但是不能调用
     */
    public Animal(){
        System.out.println("创建动物");
    }

    /**
     * 抽象方法的意义在于将设计和实现分离
     */
    public abstract void run();

    public void breath() {
        System.out.println("呼吸！");
        /**
         * 普通方法中可以调用抽象方法
         * 实际调用的时候是多态，子类在调用子类自己的 run 方法
         */
        run();
    }
}

class Cat extends Animal {

    @Override
    public void run() {
        System.out.println("猫步小跑");
    }
}

class Dog extends Animal {

    @Override
    public void run() {
        System.out.println("狗跑");
    }
}
