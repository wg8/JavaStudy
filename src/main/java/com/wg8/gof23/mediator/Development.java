package com.wg8.gof23.mediator;

/**
 * @author Harry
 * @date 2019/4/17 10:02 PM
 */
public class Development implements Department {

    /**
     * 持有中介者（总经理）的引用
     */
    private Mediator mediator;

    public Development(Mediator mediator) {
        this.mediator = mediator;
        // 注册到中介者中，互相可以引用
        mediator.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("汇报工作！没钱了，需要资金支持！");
    }

    @Override
    public void outAction() {
        System.out.println("专心科研，开发项目！");
    }
}
