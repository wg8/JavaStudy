package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 10:08 PM
 */
public class Market implements Department {

    /**
     * 持有中介者(总经理)的引用
     */
    private Mediator m;

    public Market(Mediator m) {
        this.m = m;
        m.register("market", this);
    }

    @Override
    public void outAction() {
        System.out.println("汇报工作！项目承接的进度，需要资金支持！");

        // 通过中介调用其他部门
        m.command("finacial");
    }

    @Override
    public void selfAction() {
        System.out.println("跑去接项目！");
    }
}
