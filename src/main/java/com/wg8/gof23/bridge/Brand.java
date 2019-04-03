package com.wg8.gof23.bridge;

/**
 * @author Harry
 * @date 2019/4/3 10:19 PM
 * 品牌
 */
public interface Brand {
    void sale();
}

class Lenovo implements Brand{

    @Override
    public void sale() {
        System.out.println("销售联想电脑");
    }
}

class Dell implements Brand{

    @Override
    public void sale() {
        System.out.println("销售 Dell 电脑");
    }
}

class Shenzhou implements Brand {

    @Override
    public void sale() {
        System.out.println("销售神舟电脑");
    }

}