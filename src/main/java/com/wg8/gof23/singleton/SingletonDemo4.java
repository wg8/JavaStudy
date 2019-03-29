package com.wg8.gof23.singleton;

/**
 * @author Harry
 * @date 2019/3/28 12:14 AM
 * 单例设计模式 - 枚举实现单例模式 （没有延时加载）
 */
public enum SingletonDemo4 {

    /**
     * 这个枚举元素，本身就是单例对象
     * 外部调用，直接 SingletonDemo3.INSTANCE
     * 避免反序列和反射调用，缺点：没有延时加载
     */
    INSTANCE;

    /**
     * 添加自己需要的操作
     */
    public void singletonOperation() {


    }

}
