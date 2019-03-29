package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/29 10:50 PM
 */
public class CharType {

    // boolean 只占了一位，不是一个字节

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test1() {

        char c1 = 'a';
        //unicode 码， 2个字节表示一个字符，总可以表述 65536，范围：0-65535
        char c2 = '我';
        char c3 = '\n';
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(c2);
    }

    private static void test2() {

        char c4 = 'a';
        int i = c4 + 2;
        //强制转型
        char c5 = (char) i;
        System.out.println(c5);

        //循环打印a-z
        for (int j = 0; j < 26; j++) {
            char temp = (char) (c4 + j);
            System.out.print(temp + "\t");
        }

        //java里面的字符串，是定义成：String类了。
        String str = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("\n" + str);
    }
}
