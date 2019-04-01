package com.wg8.gof23.adapter;

/**
 * @author Harry
 * @date 2019/4/1 10:55 PM
 * 适配器 (对象适配器方式,使用了组合的方式跟被适配对象整合)
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
