package com.wg8.gof23.state;

/**
 * @author Harry
 * @date 2019/4/21 9:39 AM
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}
