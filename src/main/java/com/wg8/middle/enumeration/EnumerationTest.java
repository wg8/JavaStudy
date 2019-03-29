package com.wg8.middle.enumeration;

import java.util.Enumeration;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description Enumeration 的使用
 */
public class EnumerationTest {

    public static void main(String[] args) {
        test2();

    }

    /**
     * 1、判断  hasMoreElements()
     * 2、获取 nextElement()
     * <p>
     * Vector 是一个动态数组
     * Vector 的 elements()方法
     */
    private static void test1() {
        Vector<String> vector = new Vector<String>();
        vector.add("java");
        vector.add("go");
        vector.add("python");

        Enumeration<String> en = vector.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }


    /**
     * StringTokenizer 是 Enumeration 的子类
     * 实现字符分割功能
     */
    private static void test2() {
        String str = "abc;1234;java;pu";
        StringTokenizer tokenizer = new StringTokenizer(str, ";");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextElement());
        }
    }
}
