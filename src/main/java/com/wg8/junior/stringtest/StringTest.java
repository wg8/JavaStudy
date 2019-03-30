package com.wg8.junior.stringtest;

/**
 * @author Harry
 * @date 2019/3/30 10:52 PM
 * String 类的介绍
 */
public class StringTest {

    public static void main(String[] args) {

        String str = new String("abcd");
        String str2 = new String("abcd");

        System.out.println("equals 比较内容是否相等  " + str2.equals(str));
        // 对象地址不同
        System.out.println("双等于比较对象是否相等  " + (str2 == str));

        System.out.println("测试 charAt    ：" + str.charAt(2));

        String str3 = "def";
        String str4 = "def";
        System.out.println("equals 比较内容是否相等  " + str3.equals(str4));
        System.out.println("双等于比较对象是否相等  " + (str3 == str4));

        System.out.println("测试 indexOf    " + str3.indexOf('y'));
        String s = str3.substring(0, 1);
        System.out.println("截取字符串   " + s);


        String str5 = str3.replace('e', '*');
        System.out.println("测试替换    " + str5);

        String str6 = "abcde,rrtt,cccee";
        String[] strArray = str6.split(",");
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("测试分割    " + strArray[i]);
        }
        String str7 = "  aa  bb  ";
        String str77 = str7.trim();
        System.out.println("去除字符首和尾的空格   " + str77.length());

        System.out.println("测试忽略大小写字符是否一样    " + "Abc".equalsIgnoreCase("abc"));
        System.out.println("获取字符所在索引位置      " + "Abcbd".indexOf('b'));
        System.out.println("最后一个字符所在位置    " + "Abcbd".lastIndexOf('b'));
        System.out.println("开始是否有这样的字符    " + "Abcbd".startsWith("Ab"));
        System.out.println("结尾是否有这样的字符    " + "Abcbd".endsWith("bd"));
        System.out.println("全部转为小写      " + "Abcbd".toLowerCase());
        System.out.println("全部转为大写" + "Abcbd".toUpperCase());

        /**
         * 下面的代码有 1002 个对象
         * gh 是一个
         * String("a") 是一个
         * for 循环中有 1000 个
         *
         * 非常浪费空间，尽量避免类似下面的代码
         */
        String gh = new String("a");
        for (int i = 0; i < 1000; i++) {
            gh = gh + i;
        }
        System.out.println(gh);


    }
}
