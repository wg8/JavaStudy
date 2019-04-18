package com.wg8.gof23.templateMethod;

/**
 * @author Harry
 * @date 2019/4/18 10:40 PM
 */
public class Client {

    public static void main(String[] args) {

        /**
         * 调用方式一
         */
        BankTemplateMethod btm = new DrawMoney();
        btm.process();

        /**
         * 调用方式二
         * 采用匿名内部类
         */
        BankTemplateMethod btm2 = new BankTemplateMethod() {
            @Override
            public void transact() {
                System.out.println("我要存钱");
            }
        };

        btm2.process();

    }
}

class DrawMoney extends BankTemplateMethod {

    @Override
    public void transact() {
        System.out.println("我要取款！！！");
    }

}
