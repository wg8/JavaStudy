package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:40 PM
 * 用来构建子组件
 */
public interface AirShipBuilder {

    Engine builderEngine();

    OrbitalModule builderOrbitalModule();

    EscapeTower builderEscapeTower();
}
