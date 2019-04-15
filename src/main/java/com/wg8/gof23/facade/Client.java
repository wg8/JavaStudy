package com.wg8.gof23.facade;

/**
 * @author Harry
 * @date 2019/4/15 11:47 PM
 */
public class Client {

    public static void main(String[] args) {


    }

    /**
     * 非外观模式
     */
    private static void test1() {
        工商局 a = new 海淀区工商局();
        a.checkName();
        质检局 b = new 海淀质检局();
        b.orgCodeCertificate();
        税务局 c = new 海淀税务局();
        c.taxCertificate();
        银行 d = new 中国工商银行();
        d.openAccount();
    }

    /**
     * 外观模式
     */
    private static void test2() {
        new RegisterFacade().register();
    }
}
