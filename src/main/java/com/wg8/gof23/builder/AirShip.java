package com.wg8.gof23.builder;

/**
 * @author Harry
 * @date 2019/4/1 9:33 PM
 * 宇宙飞船
 */
public class AirShip {

    /**
     * 轨道舱
     */
    private OrbitalModule orbitalModule;

    /**
     * 发动机
     */
    private Engine engine;

    /**
     * 逃逸塔
     */
    private EscapeTower escapeTower;

    public void launch(){
        System.out.println("发射！");
    }

    public OrbitalModule getOrbitalModule() {
        return orbitalModule;
    }

    public void setOrbitalModule(OrbitalModule orbitalModule) {
        this.orbitalModule = orbitalModule;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }
}

class OrbitalModule {
    private String name;

    public OrbitalModule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Engine {
    private String name;

    public Engine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class EscapeTower {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EscapeTower(String name) {
        super();
        this.name = name;
    }

}


