package com.wg8.middle.guava;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.collect.*;
import org.checkerframework.checker.nullness.qual.Nullable;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author Harry
 * @Date 2019/3/28
 * @Description 函数式编程-解耦
 */
public class GuavaTest {

    public static void main(String[] args) {
        test8();
    }

    /**
     * 只读
     */
    private static void test1() {

        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        // 对原有的 list 进行包装，相等于原有List的一个视图，快照，不够安全
        List<String> readList = Collections.unmodifiableList(list);
        // 无法写入，写入抛异常
        //readList.add("d");

        // 改变原有List 视图也一起改变
        list.add("d");

        // 由于上述的问题，所以做出新的改进，如下
        List<String> immutableList = ImmutableList.of("a", "b", "c");
        // 无法写入，写入抛异常，且下述方法不再推荐使用
        immutableList.add("d");
    }

    /**
     * 转换
     */
    private static void test2() {
        // 类型转换
        Set<Long> timeSet = Sets.newHashSet();
        timeSet.add(110000000L);
        timeSet.add(9999990000000L);
        timeSet.add(11L);

        Collection<String> timeStrCol = Collections2.transform(timeSet, new Function<Long, String>() {
            @Nullable
            public String apply(@Nullable Long aLong) {
                return new SimpleDateFormat("yyyy-MM-dd").format(aLong);
            }
        });

        for (String temp : timeStrCol) {
            System.out.println(temp);
        }
    }

    /**
     * 组合式函数编程
     */
    private static void test3() {

        //功能点：确保容器中的字符串长度不超过5，超过进行截取，后全部大写

        // 容器
        List<String> list = Lists.newArrayList("hello", "good", "tomorrow");

        // 函数一：确保容器中的字符串长度不超过5，超过进行截取
        Function<String, String> function1 = new Function<String, String>() {
            @Nullable
            public String apply(@Nullable String s) {
                return s.length() > 5 ? s.substring(0, 5) : s;
            }
        };

        // 函数一：转化成大写
        Function<String, String> function2 = new Function<String, String>() {
            @Nullable
            public String apply(@Nullable String s) {
                return s.toUpperCase();
            }
        };

        // 组合
        Function<String, String> f = Functions.compose(function1, function2);

        // 关联
        Collection<String> resultCol = Collections2.transform(list, f);

        for (String temp : resultCol) {
            System.out.println(temp);
        }
    }

    /**
     * 集合的操作:交集、差集、并集
     */
    private static void test4() {
        Set<Integer> sets1 = Sets.newHashSet(1, 2, 3, 4, 5, 6);
        Set<Integer> sets2 = Sets.newHashSet(3, 4, 5, 6, 7, 8, 9);

        //交集
        System.out.println("交集为:");
        Sets.SetView<Integer> intersection = Sets.intersection(sets1, sets2);
        for (Integer temp : intersection) {
            System.out.println(temp);
        }

        //差集
        System.out.println("差集为:");
        Sets.SetView<Integer> diff = Sets.difference(sets1, sets2);
        for (Integer temp : diff) {
            System.out.println(temp);
        }

        //并集
        System.out.println("并集为:");
        Sets.SetView<Integer> union = Sets.union(sets1, sets2);
        for (Integer temp : union) {
            System.out.println(temp);
        }
    }

    /**
     * 统计单词出现的次数
     * 1、HashMap 分拣存储+面向对象思维  -->判断
     * 2、Multiset :无序+可重复   .count()  增强了可读性 +操作简单
     */
    private static void test5() {

        String str = "this is a cat and that is a mice where is the food";
        String[] arrayStr = str.split(" ");
        Multiset<String> multiset = HashMultiset.create();
        for (String temp : arrayStr) {
            multiset.add(temp);
        }

        // 获取所有单词的 set
        Set<String> sets = multiset.elementSet();
        for (String temp : sets) {
            System.out.println(temp + "   >>>>   " + multiset.count(temp));
        }
    }

    /**
     * 分析查看 教师  教授的每门课程
     * Multimap :key-value  key可以重复
     */
    private static void test6() {

        Map<String, String> map = new HashMap<String, String>();
        // 加入测试数据
        map.put("汉字", "语文老师");
        map.put("加法法则", "数学老师");
        map.put("清朝", "历史老师");
        map.put("汉朝", "历史老师");
        map.put("明朝", "历史老师");
        map.put("自然界", "生物老师");

        // Multimap
        Multimap<String, String> multimap = ArrayListMultimap.create();

        // 迭代器
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            multimap.put(value, key);
        }

        // 查看Multimap
        Set<String> set = multimap.keySet();
        for (String temp : set) {
            Collection<String> col = multimap.get(temp);
            System.out.println(temp + "   >>>>>    " + col);
        }
    }

    /**
     * HashMap 键唯一，值可以重复
     * BiMap:双向Map(Bidirectional Map ) 键与值都不能重复(unique -valued map)
     */
    private static void test7() {
        BiMap<String, String> biMap = HashBiMap.create();
        biMap.put("hello", "test");
        biMap.put("hi", "demo");
        // 通过 value 找 key
        String key = biMap.inverse().get("test");
        System.out.println(key);
        System.out.println(biMap.inverse().inverse() == biMap);
    }

    /**
     * 双键的Map -->Table -->rowKey+columnKey+value
     * 1、方法
     * 所有的行数据:cellSet()
     * 所有的学生: rowKeySet()
     * 所有的课程:columnKeySet()
     * 所有的成绩: values()
     * 学生对应的课程: rowMap() +get(学生)
     * row(学生)
     * 课程对应的学生: columnMap +get(课程)
     * column(课程)
     */
    private static void test8() {

        Table<String, String, Integer> tables = HashBasedTable.create();
        //测试数据
        tables.put("a", "javase", 80);
        tables.put("b", "javase", 90);
        tables.put("a", "oracle", 100);
        tables.put("c", "oracle", 95);

        // 所有的行数据
        Set<Table.Cell<String, String, Integer>> set = tables.cellSet();
        for (Table.Cell<String, String, Integer> temp : set) {
            System.out.println(temp.getRowKey() + "  >>>>  " + temp.getColumnKey() + "  >>  " + temp.getValue());
        }

        System.out.println("==========学生查看成绩==============");
        System.out.print("学生\t");
        // 所有的课程
        Set<String> cours = tables.columnKeySet();
        for (String temp : cours) {
            System.out.print(temp + "\t");
        }
        System.out.println();
        // 所有的学生
        Set<String> stu = tables.rowKeySet();
        for (String temp : stu) {
            System.out.print(temp + "\t");
            Map<String, Integer> scores = tables.row(temp);
            for (String c : cours) {
                System.out.print(scores.get(c) + "\t");
            }
            System.out.println();
        }

        System.out.println("==========课程查看成绩==============");
        System.out.print("课程\t");
        // 所有的学生
        Set<String> stuSet = tables.rowKeySet();
        for (String t : stuSet) {
            System.out.print(t + "\t");
        }
        System.out.println();
        // 所有的课程
        Set<String> courSet = tables.columnKeySet();
        for (String c : courSet) {
            System.out.print(c + "\t");
            Map<String, Integer> scores = tables.column(c);
            for (String s : stuSet) {
                System.out.print(scores.get(s) + "\t");
            }
            System.out.println();
        }

        System.out.println("===========转换===========");
        Table<String, String, Integer> tables2 = Tables.transpose(tables);
        //所有的行数据
        Set<Table.Cell<String, String, Integer>> cells2 = tables2.cellSet();
        for (Table.Cell<String, String, Integer> temp : cells2) {
            System.out.println(temp.getRowKey() + "-->" + temp.getColumnKey() + "-->" + temp.getValue());
        }
    }


}
