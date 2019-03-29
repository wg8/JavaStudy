package com.wg8.gof23.singleton;

/**
 * @author Harry
 * @date 2019/3/28 12:14 AM
 * 单例设计模式 - 饿汉式
 */
public class SingletonDemo1 {

    /**
     * 创建唯一的实例
     * 类初始化时，立即加载（没有延时加载的优势）
     * 加载类时，天然的是线程安全的
     */
    private static SingletonDemo1 instance = new SingletonDemo1();

    /**
     * 私有化构造器，禁止外部创建
     */
    private SingletonDemo1() {

    }

    /**
     * 提供一个获取实例的方法
     * 方法没有同步，调用效率高
     */
    public static SingletonDemo1 getInstance() {
        return instance;
    }


}
