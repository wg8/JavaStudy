package com.wg8.gof23.state;

/**
 * @author Harry
 * @date 2019/4/21 9:38 AM
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
}
