package com.wg8.gof23.singleton;

/**
 * @author Harry
 * @date 2019/3/28 12:14 AM
 * 单例设计模式 - 静态内部类实现单例模式
 * 线程安全、调用效率高、并且实现了延时加载
 */
public class SingletonDemo3 {


    private static class SingletonClassInstance {
        private static final SingletonDemo3 instance = new SingletonDemo3();
    }

    private SingletonDemo3() {
    }

    public static SingletonDemo3 getInstance() {
        return SingletonClassInstance.instance;
    }

}
