package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:41 PM
 * 用来组装、装配
 */
public interface AirShipDirector {

    /**
     * 组装飞船对象
     *
     * @return
     */
    AirShip directAirShip();
}
