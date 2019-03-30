package com.wg8.algorithm;

/**
 * @author Harry
 * @date 2019/3/30 9:50 AM
 * 递归算法
 */
public class Recursion {

    private static int a = 0;


    public static void main(String[] args) {

    }

    /**
     * 递归结构包括两部分：
     * 定义递归头
     * 递归体
     */
    private static void test1() {
        a++;
        System.out.println("test01:" + a);
        if (a <= 10) {
            //递归头
            test1();
        } else {
            //递归体
            System.out.println("over");
        }
    }

    /**
     * 求某一个数的阶乘
     *
     * @param n
     * @return
     */
    private static long test2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * test2(n - 1);
        }
    }

}
