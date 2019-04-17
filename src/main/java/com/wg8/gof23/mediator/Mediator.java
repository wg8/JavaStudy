package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 10:00 PM
 */
public interface Mediator {

    void register(String dname, Department d);

    void command(String dname);
}
