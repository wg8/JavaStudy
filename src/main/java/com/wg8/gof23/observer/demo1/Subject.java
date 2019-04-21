package com.wg8.gof23.observer.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Harry
 * @date 2019/4/21 11:09 AM
 * 目标对象
 */
public class Subject {

    /**
     * 存放所有的观察者
     */
    protected List<Observer> list = new ArrayList<Observer>();

    public void registerObserver(Observer obs) {
        list.add(obs);
    }

    public void removeObserver(Observer obs) {
        list.add(obs);
    }

    /**
     * 通知所有的观察者更新状态
     */
    public void notifyAllObservers() {
        for (Observer obs : list) {
            obs.update(this);
        }
    }
}
