package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:50 PM
 */
public class Client {

    public static void main(String[] args) {

        AirShipDirector director = new HaAirshipDirector(new HaAirShipBuilder());

        AirShip ship = director.directAirShip();

        System.out.println(ship.getEngine().getName());

        ship.launch();

    }
}
