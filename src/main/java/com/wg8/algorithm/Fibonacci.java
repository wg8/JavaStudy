package com.wg8.algorithm;

/**
 * @author Harry
 * @date 2019/5/7
 * 斐波那契数列
 * 这个数列从第3项开始，每一项都等于前两项之和
 */
public class Fibonacci {

    // 问题：要求输入一个整数 n，请你输出斐波那契数列的第 n 项。 n<=39

    int sign = 0;

    public static void main(String[] args) {
        System.out.println(test(6));
    }

    private static Integer test(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num == 1 || num == 2) {
            return 1;
        }
        return test(num - 2) + test(num - 1);
    }
}
