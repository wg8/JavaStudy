package com.wg8.gof23.observer.demo2;

import java.util.Observable;
import java.util.Observer;

/**
 * @author Harry
 * @date 2019/4/21 11:24 AM
 */
public class ObserverA implements Observer {

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject) o).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
