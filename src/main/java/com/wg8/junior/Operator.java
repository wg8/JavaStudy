package com.wg8.junior;

/**
 * @author Harry
 * @date 2019/3/29 11:40 PM
 * 算术、逻辑、位运算符
 */
public class Operator {

    /**
     * Java 支持如下运算符
     * 算术运算符：+ ，- ，* ，/ ，% ，++ ，--
     * 赋值运算符：=
     * 关系运算符：>，< ，>= ，<= ，== ，!=，instanceof
     * 逻辑运算符：&&，||，！（操作布尔变量）
     * 位运算符：&，|，^，~，>>，<<，>>>
     * 条件运算符：? :
     * 扩展赋值运算符：+=，-=，*=，/=，%=
     * a+=b 相当于 a=a+b
     */

    public static void main(String[] args) {
        test5();
    }

    private static void test1() {

        int c = 10 % 2;
        System.out.println(c);

        // 小数也可以取余数
        double d = 10.2 % 3;
        System.out.println(d);

    }

    private static void test2() {
        int a = 3;
        // 先用后加
        int b = a++;
        // 先加后用
        int c = ++a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    private static void test3() {
        // 运行会报错
        int a = 3 / 0;
        System.out.println(a);

        // 短路与 情况，判断为 1>2 为 false ，不会执行后面的，不会报错
        boolean b = 1 > 2 && 2 > (3 / 0);
        System.out.println(b);

        // 短路与 情况，判断为 1<2 为 true ，会执行后面的，然后报错
        boolean c = 1 < 2 && 2 > (3 / 0);
        System.out.println(c);
    }

    private static void test4() {

        //测试位运算
        int m = 8;
        int n = 4;
        System.out.println(m & n);
        System.out.println(m | n);
        // 涉及到 32位（4字节 * 8位）中的第一位符号问题，把符号也取反了
        System.out.println(~m);
        System.out.println(m ^ n);

        // 移位
        // 左移一位相当于 乘以2
        // 右移一位相当于 除以2取商
        int a = 3 * 2 * 2;
        //相当于：3*2*2*2;
        int b = 3 << 3;
        int c = 12 / 2 / 2;
        int d = 12 >> 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        // 求 3 * 16 最快
        int e = 3 << 4;
        System.out.println(e);
    }

    private static void test5() {
        //扩展运算符
        int a = 3;
        //a = a+5;
        a += 5;
        System.out.println(a);
    }

    /**
     * 三元运算符（三目运算符）
     */
    private static void test6() {
        int a = 3;
        int b = 5;
        String str = "";
        str = (a < b) ? "a<b" : "a>=b";
        System.out.println(str);
    }
}
