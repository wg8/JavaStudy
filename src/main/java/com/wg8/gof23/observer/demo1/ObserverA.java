package com.wg8.gof23.observer.demo1;

/**
 * @author Harry
 * @date 2019/4/21 11:15 AM
 * 观察者
 */
public class ObserverA implements Observer {

    /**
     * myState需要跟目标对象的state值保持一致！
     */
    private int myState;

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
