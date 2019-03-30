package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/30 9:37 AM
 */
public class WhileForTest {

    public static void main() {
        test1();
        test2();
        test3();
        test4();
    }

    /**
     * 求 100 以内奇数和偶数的和分别是多少
     */
    private static void test1() {
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                oddSum += i;
            } else {
                evenSum += i;
            }

        }
        System.out.println("奇数的和：" + oddSum);
        System.out.println("偶数的和：" + evenSum);
    }

    /**
     * 1000 以内被 5 整除的数，每行显示 3 个
     */
    private static void test2() {
        for (int j = 1; j <= 1000; j++) {
            if (j % 5 == 0) {
                System.out.print(j + "\t");
            }
            if (j % (5 * 3) == 0) {
                System.out.println();
            }
        }

    }

    /**
     * 打印 99 乘法表
     */
    private static void test3() {
        for (int m = 1; m <= 9; m++) {
            for (int i = 1; i <= m; i++) {
                System.out.print(i + "*" + m + "=" + (i * m) + "\t");
            }
            System.out.println();
        }
    }

    private static void test4() {
    }
}
