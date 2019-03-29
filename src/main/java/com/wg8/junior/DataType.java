package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/29 10:16 PM
 * 整数类型
 */
public class DataType {

    /**
     * args 是 arguments
     *
     * @param args
     */
    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {
        // java内部采用了Unicode字符集，universal
        int 测试 = 10;
        System.out.println(测试);
    }


    /**
     * 占用字节数
     * byte 1字节 -128 ~ 127
     * short 2字节 -2^15 ~ 2^15-1   >>  -32768 ~ 32767
     * int 4字节  -2^31 ~ 2^31 约正负 21 亿
     * long 8字节  -2^63 ~ 2^63
     *
     * 如果 long 不够表述，可以使用  ----->>>    BigDecimal
     */
    private static void test2() {

        int a = 10;

        // 十进制转二进制
        System.out.println(Integer.toBinaryString(a));
        // 十进制转八进制
        System.out.println(Integer.toOctalString(a));
        // 十进制转十六进制
        System.out.println(Integer.toHexString(a));

        //如果数据的大小没有超过byte/short/char的表述范围，则可以自动转型
        byte b2 = 127;
    }

    /**
     * 数据类型
     * |
     * |----基本数据类型
     * |    |
     * |    |----数值型
     * |    |      |---- 整数类型：byte、short、int、long
     * |    |      |---- 浮点型：float、double
     * |    |----字符型
     * |    |----布尔型
     * |
     * |----引用数据类型
     * |        |----类
     * |        |----接口
     * |        |----数组
     */
}