package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 9:59 PM
 * 同事类的接口
 */
public interface Department {

    /**
     * 做本部门的事情
     */
    void selfAction();

    /**
     * 向总经理发出申请
     */
    void outAction();
}
