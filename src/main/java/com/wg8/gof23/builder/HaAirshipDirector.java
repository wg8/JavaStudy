package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:47 PM
 */
public class HaAirshipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public HaAirshipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }


    @Override
    public AirShip directAirShip() {

        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        //装配成飞船对象
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setEscapeTower(et);
        ship.setOrbitalModule(o);
        return ship;
    }
}
