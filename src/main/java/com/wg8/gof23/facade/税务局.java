package com.wg8.gof23.facade;

/**
 * @author Harry
 * @date 2019/4/15 11:43 PM
 */
public interface 税务局 {
    /**
     * 办理税务登记证
     */
    void taxCertificate();
}


class 海淀税务局 implements 税务局 {

    @Override
    public void taxCertificate() {
        System.out.println("在海淀税务局办理税务登记证！");
    }
}
