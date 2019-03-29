package com.wg8.junior;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Harry
 * @date 2019/3/29 10:43 PM
 */
public class FloatType {

    public static void main(String[] args) {

        //浮点数常量默认类型是double
        double d0 = 3.14;
        System.out.println(d0);

        float f0 = 6.28F;
        System.out.println(f0);
        //采用科学计数法的写法

        double d2 = 314e-2;
        System.out.println(d2);

        float f = 0.1f;
        System.out.println(f);

        double d = 1.0 / 10;
        System.out.println(d);

        // false 同为 0.1，但是在内存中有异差
        System.out.println(f == d);



        /**
         * BigDecimal：表示 大的 小数
         * BigInteger：表示 大的 整数
         */

    }

}
