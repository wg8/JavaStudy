package com.wg8.gof23.bridge;

/**
 * @author Harry
 * @date 2019/4/3 10:30 PM
 */
public class Client {


    public static void main(String[] args) {

        //销售联想的笔记本电脑
        Computer c1 = new Laptop(new Lenovo());
        c1.sale();

        //销售神舟的台式机
        Computer c2 = new Desktop(new Shenzhou());
        c2.sale();
    }

}
