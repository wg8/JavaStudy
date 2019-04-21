package com.wg8.gof23.state;

/**
 * @author Harry
 * @date 2019/4/21 9:40 AM
 */
public class HomeContext {

    private State state;

    public void setState(State s) {
        System.out.println("修改状态！");
        state = s;
        state.handle();
    }
}
