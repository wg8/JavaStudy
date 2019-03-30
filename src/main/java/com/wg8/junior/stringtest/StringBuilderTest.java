package com.wg8.junior.stringtest;

/**
 * @author Harry
 * @date 2019/3/31 12:47 AM
 * <p>
 * String：不可变字符序列
 * 可变字符序列：
 * StringBuilder：线程不安全，效率高（常用）
 * StringBuffer：线程安全，效率低
 */
public class StringBuilderTest {


    /**
     * StringBuilder 和 StringBuffer 的区别
     * StringBuffer 的方法前都加了 synchronized
     *
     * 而且它们的 char[] 是动态扩容的
     *
     */


    public static void main(String[] args) {


    }

    private static void test1() {
        //字符数组长度初始为16
        StringBuilder sb = new StringBuilder();
        //字符数组长度初始为32
        StringBuilder sb1 = new StringBuilder(32);
        //字符数组长度初始为32, value[]={'a','b','c','d',\u0000,\u0000...}
        // \u0000 为 char 类型默认内容
        StringBuilder sb2 = new StringBuilder("abcd");
        sb2.append("efg");
        sb2.append(true).append(321).append("随便");
        System.out.println(sb2);


        /**
         * 持续 append 是方法链，通过 return this 实现
         * 示例如下：
         *     public StringBuilder append(String str) {
         *         super.append(str);
         *         return this;
         *     }
         */

        /**
         * 如下的内容优于 StringTest 中的方法，因为使用了 append
         * 而且只有两个对象 "a" 和 gh
         */

        int sign = 1000;

        StringBuilder gh = new StringBuilder("a");
        for (int i = 0; i < sign; i++) {
            gh.append(i);
        }
        System.out.println(gh);


    }

    private static void test2() {
        StringBuilder sb = new StringBuilder("abcdefghijklmnopqrstuvwxyz");
        // 动态数据，所以可以删除同样索引的数据
        sb.delete(3, 5).delete(3, 5);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);

        StringBuffer sb2 = new StringBuffer();
    }
}
