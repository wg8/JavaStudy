package com.wg8.gof23.observer.demo1;

/**
 * @author Harry
 * @date 2019/4/21 11:13 AM
 */
public class ConcreteSubject extends Subject {

    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        //主题对象(目标对象)值发生了变化，请通知所有的观察者
        this.notifyAllObservers();
    }

}
