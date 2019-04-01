package com.wg8.gof23.adapter;

/**
 * @author Harry
 * @date 2019/4/1 10:55 PM
 * 适配器 (类适配器方式)
 */
public class Adapter extends Adaptee implements Target{
    @Override
    public void handleReq() {
        super.request();
    }
}
