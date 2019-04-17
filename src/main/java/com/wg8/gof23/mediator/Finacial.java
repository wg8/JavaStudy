package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 10:07 PM
 */
public class Finacial implements Department {

    /**
     * 持有中介者(总经理)的引用
     */
    private Mediator m;

    public Finacial(Mediator m) {
        this.m = m;
        m.register("finacial", this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！没钱了，钱太多了！怎么花?");
    }

    @Override
    public void selfAction() {
        System.out.println("数钱！");
    }
}
