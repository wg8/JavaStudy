package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:43 PM
 */
public class HaAirShipBuilder implements AirShipBuilder {

    @Override
    public Engine builderEngine() {
        System.out.println("构建发动机！");
        // return 的地方可以和工厂模式结合起来使用
        return new Engine("哈牌发动机！");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        System.out.println("构建轨道舱");
        return new OrbitalModule("哈牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        System.out.println("构建逃逸塔");
        return new EscapeTower("哈牌逃逸塔");
    }
}
