package com.wg8.gof23.facade;

/**
 * @author Harry
 * @date 2019/4/15 11:44 PM
 */
public interface 质检局 {
    /**
     * 办理组织机构代码证
     */
    void orgCodeCertificate();
}


class 海淀质检局 implements 质检局 {

    @Override
    public void orgCodeCertificate() {
        System.out.println("在海淀区质检局办理组织机构代码证！");
    }

}
