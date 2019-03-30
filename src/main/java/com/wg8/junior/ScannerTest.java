package com.wg8.junior;

import java.util.Scanner;

/**
 * @author Harry
 * @date 2019/3/30 9:57 AM
 * 获取键盘输入：Scanner 的使用
 */
public class ScannerTest {


    public static void main(String[] args) {
        test1();
    }

    public static void test1() {

        Scanner s = new Scanner(System.in);
        //程序运行到 next 会阻塞，等待键盘的输入！
        String str = s.next();
        System.out.println("刚才键盘输入：" + str);
    }

    public static void test2() {

        Scanner s = new Scanner(System.in);

        System.out.println("请输入一个加数：");
        int a = s.nextInt();

        System.out.println("请输入被加数：");
        int b = s.nextInt();

        int sum = a + b;
        System.out.println("计算结果，和为：" + sum);
    }

}
