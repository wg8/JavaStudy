package com.wg8.gof23.decorator;

/**
 * @author Harry
 * @date 2019/4/15 11:02 PM
 * 抽象构建
 */
public interface ICar {
    void move();
}

/**
 * 真实构建（具体构建角色）
 */
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑。。。");
    }
}

/**
 * 定义装饰器
 */
class SuperCar implements ICar {

    protected ICar car;

    public SuperCar(ICar car) {
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

class FlyCar extends SuperCar{

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly(){
        System.out.println("天上飞...");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }
}

class WaterCar extends SuperCar{

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim(){
        System.out.println("水上游 ...");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AICar extends SuperCar{

    public AICar(ICar car) {
        super(car);
    }

    public void autoMove(){
        System.out.println("自动跑 ...");
    }

    @Override
    public void move() {
        super.move();
        autoMove();
    }
}

