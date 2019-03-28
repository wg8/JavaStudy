package com.wg8.gof23.singleton;

/**
 * @author Harry
 * @date 2019/3/28 12:14 AM
 * 单例设计模式 - 懒汉式
 */
public class SingletonDemo2 {

    /**
     * 创建唯一的实例
     * 不初始化对象，真正用的时候再延时加载
     */
    private static SingletonDemo2 instance;

    /**
     * 私有化构造器，禁止外部创建
     */
    private SingletonDemo2() {

    }

    /**
     * 提供一个获取实例的方法
     * 方法同步，调用效率低
     */
    public static synchronized SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();

        }
        return instance;
    }

}
