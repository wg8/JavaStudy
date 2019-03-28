package com.wg8.commons;

import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.functors.AllPredicate;
import org.apache.commons.collections4.functors.EqualPredicate;
import org.apache.commons.collections4.functors.NotNullPredicate;
import org.apache.commons.collections4.functors.UniquePredicate;
import org.apache.commons.collections4.list.PredicatedList;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Harry
 * @Date 2019/3/27
 * @Description 函数式接口：Predicate
 */
public class PredicateTest {

    public static void main(String[] args) {
        selfPre();
    }

    /**
     * 比较相等判断
     */
    private static void equal() {
        // 方法一
        Predicate<String> pre = new EqualPredicate<String>("abcdefg");
        boolean flag = pre.evaluate("test");
        System.out.println(flag);
        boolean flag1 = pre.evaluate("abcdefg");
        System.out.println(flag1);
        // 方法二
        Predicate<String> pre1 = EqualPredicate.equalPredicate("zxcvb");
        boolean flag2 = pre1.evaluate("test1");
        System.out.println(flag2);
        boolean flag3 = pre1.evaluate("zxcvb");
        System.out.println(flag3);

    }

    private static void notNull() {
        // 方法一
        Predicate notNull = NotNullPredicate.INSTANCE;
        String test = "abcdefg";
        System.out.println(notNull.evaluate(test));
        String test1 = null;
        System.out.println(notNull.evaluate(test1));
        // 方法二
        Predicate notNull1 = NotNullPredicate.notNullPredicate();
        String test2 = "abcdefg";
        System.out.println(notNull.evaluate(test2));
        String test3 = null;
        System.out.println(notNull.evaluate(test3));

        // 容器值的判断（括号中的内容为 容器+判断）
        List<Long> list = PredicatedList.predicatedList(new ArrayList<Long>(), notNull);
        list.add(1000L);
        // 容器值的判断
        List<Long> list1 = PredicatedList.predicatedList(new ArrayList<Long>(), notNull);
        list1.add(1000L);
        list1.add(null);
    }

    private static void unique() {
        // 非唯一的情况可以 add
        Predicate<Long> predicate = UniquePredicate.uniquePredicate();
        List<Long> list = PredicatedList.predicatedList(new ArrayList<Long>(), predicate);
        list.add(1000L);
        list.add(2000L);
        // 不唯一的情况不能 add
        List<Long> list1 = PredicatedList.predicatedList(new ArrayList<Long>(), predicate);
        list1.add(1000L);
        list1.add(2000L);
        // 出现重复值，抛出异常
        list1.add(1000L);
    }

    /**
     * 自定义判断
     */
    private static void selfPre() {

        // 自定义判别式，判断长度是否>= 5 且 <= 20
        Predicate<String> selfPre = new Predicate<String>() {
            public boolean evaluate(String s) {
                return s.length() >= 5 && s.length() <= 20;
            }
        };

        // 普通使用，使用上述的自定义判别式
        boolean flag = selfPre.evaluate("1234");
        System.out.println(flag);
        boolean flag1 = selfPre.evaluate("12345");
        System.out.println(flag1);

        // 使用 list ，使用上述的自定义判别式
        List<String> list = PredicatedList.predicatedList(new ArrayList<String>(), selfPre);
        list.add("12345");
        // 下行代码会抛出异常
        list.add("1234");

        // 多种判别方式组合使用，即
        Predicate notNull = NotNullPredicate.notNullPredicate();
        // 注意 AllPredicate 的先后顺序
        Predicate all = AllPredicate.allPredicate(notNull,selfPre);
        Predicate all1 = PredicateUtils.allPredicate(notNull, selfPre);
        List<String> list1 = PredicatedList.predicatedList(new ArrayList<String>(), all1);
        list1.add("12345");
        //list1.add("1234");  // 抛出异常
        //list1.add(null);  // 注意使用的先后顺序

    }

}
