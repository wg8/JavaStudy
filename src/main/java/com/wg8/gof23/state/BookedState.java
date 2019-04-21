package com.wg8.gof23.state;

/**
 * @author Harry
 * @date 2019/4/21 9:37 AM
 * 已预订状态
 */
public class BookedState implements State {
    @Override
    public void handle() {
        System.out.println("房间已预订！别人不能定！");
    }
}
