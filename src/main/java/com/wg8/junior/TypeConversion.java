package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/29 10:58 PM
 * 类型转换
 */
public class TypeConversion {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
    }

    /**
     * 基本类型问题
     * 自动类型转换：容量小的数据类型可以自动转化为容量大的数据类型
     * 不是字节数，而是表述的范围
     * char > int
     * byte > short > int > long
     * int > double
     * float > double
     * 下面的也可以自动转，float 和 double 是有误差的，有可能会损失精度
     * int > float
     * long > float
     * long > double
     */
    private static void test1() {
        // 可以将整型值（int）直接赋值给 byte、short、char 但是不能超出范围

        byte b = 123;

        // 下面两行超出范围了
        //byte b2 = 300;
        //char c = -3;

        char c2 = 'a';
        int i = c2;
        long d01 = 123213;
        float f = d01;

    }

    /**
     * 强制转型
     */
    private static void test2() {
        int i2 = -100;
        // -100超过char的表数范围，所以转换成完全不同的值，无意义的值！
        char c3 = (char) i2;
        System.out.println(c3);
    }

    /**
     * 表达式中的类型提示
     */
    private static void test3() {

        int a = 3;
        long b = 4;
        // 做所有的二元运算符(+-/*%)，都会有类型提升的问题！
        // 因为类型自动被提升为 long ,无法赋值给 int
        //int c = a + b;
        // 强制类型转换，但是会损失精度
        int c = (int) (a + b);

        double d = 5.3;
        // 因为类型被自动提升为 double ，无法赋值给 float
        //float f = a + d;
        float f = (float) (a + d);
    }

    private static void test4() {
        //10亿
        int money = 1000000000;
        int years = 20;

        //返回的是负数，因为结果超出了 int 的范围
        int total1 = money * years;
        System.out.println(total1);

        //返回的是负数，因为在赋值之前就已经溢出了
        long total2 = money * years;
        System.out.println(total2);

        // 正解
        long total3 = (long) money * years;
        System.out.println(total3);

        //一个人70年心跳多少次

        // 返回负数，结果溢出
        long times1 = 70 * 60 * 24 * 365 * 70;
        System.out.println(times1);

        // 提前转成 long，不建议把 L 放最后，有可能在最后乘之前就已经溢出
        long times2 = 70 * 60 * 24 * 365 * 70L;
        System.out.println(times2);

        // L 最好放在第一位
        long times3 = 70L * 60 * 24 * 365 * 70;
        System.out.println(times3);
    }

}
