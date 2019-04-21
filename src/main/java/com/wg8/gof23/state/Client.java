package com.wg8.gof23.state;

/**
 * @author Harry
 * @date 2019/4/21 9:41 AM
 */
public class Client {

    public static void main(String[] args) {
        HomeContext homeContext = new HomeContext();
        homeContext.setState(new FreeState());
        homeContext.setState(new BookedState());
    }
}
