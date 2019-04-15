package com.wg8.gof23.facade;

/**
 * @author Harry
 * @date 2019/4/15 11:42 PM
 */
public interface 工商局 {
    /**
     * 核名
     */
    void checkName();
}

class 海淀区工商局 implements 工商局 {

    @Override
    public void checkName() {
        System.out.println("检查名字是否有冲突！");
    }

}
